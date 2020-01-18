package com.raka.adventcalendar.presentation.adapter

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raka.adventcalendar.R
import com.raka.adventcalendar.model.DateItem
import kotlinx.android.synthetic.main.item_date.view.*


class DateAdapter(
    val dateList: List<DateItem>,
    val context: Context,
    private val currentDate: Int
) :
    RecyclerView.Adapter<DateAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_date, parent, false)
        return ViewHolder(v)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount() = dateList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dateList[position])
        if (currentDate >= dateList[position].dateValue) {
            setFlipAnimation(holder, position)
        } else {
            setImageBlur(holder)
        }

    }

    /**
     * set blur on the image if the image date above the current date
     */
    private fun setImageBlur(holder: ViewHolder) {
        holder.itemView.iv_date.alpha = 0.2f
    }

    /**
     * Set flip animation on the image
     * when the image date is below or equals current date
     */
    private fun setFlipAnimation(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            holder.itemView.iv_date.animate().rotationY(90f)
                .setListener(getAnimatorListenerAdapter(position, holder))
        }
    }

    private fun getAnimatorListenerAdapter(
        position: Int,
        holder: ViewHolder
    ): AnimatorListenerAdapter = object : AnimatorListenerAdapter() {

        override fun onAnimationEnd(animation: Animator?) {
            super.onAnimationEnd(animation)
            if (dateList[position].isFlipped) {
                holder.itemView.iv_date.setImageDrawable(context.getDrawable(dateList[position].imgFront))
                dateList[position].isFlipped = false
            } else {
                holder.itemView.iv_date.setImageDrawable(context.getDrawable(dateList[position].imgBack))
                dateList[position].isFlipped = true
            }
            holder.itemView.iv_date.rotationY = 270f
            holder.itemView.iv_date.animate().rotationY(360f).setListener(null)

        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: DateItem) {
            itemView.iv_date.setImageResource(item.imgFront)

        }
    }
}