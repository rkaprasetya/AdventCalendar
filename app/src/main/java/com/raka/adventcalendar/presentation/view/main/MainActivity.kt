package com.raka.adventcalendar.presentation.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raka.adventcalendar.AdventCalendarApplication
import com.raka.adventcalendar.R
import com.raka.adventcalendar.di.component.DaggerMainActivityComponent
import com.raka.adventcalendar.di.component.MainActivityComponent
import com.raka.adventcalendar.di.module.ActivityModule
import com.raka.adventcalendar.model.DateItem
import com.raka.adventcalendar.presentation.adapter.DateAdapter
import com.raka.adventcalendar.presentation.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),MainContracts.view {

    @Inject
    lateinit var presenter : MainPresenterImpl

    lateinit var component : MainActivityComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDagger()
        initWidget()
        presenter.loadData()

    }

    private fun setupDagger(){
        component = DaggerMainActivityComponent.builder().activityModule(ActivityModule(this))
            .applicationComponent((application as AdventCalendarApplication).getApplicationComponent())
            .build()
        component.inject(this)
    }

    private fun initWidget() {
        setFullDate(presenter.getCurrentDate())
        rv_top.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv_bottom.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
    }




    private fun setFullDate(fullDate: String) {
        tv_date.text = fullDate
    }

    override fun setAdapter(shuffledList:List<DateItem>,currentDate:Int) {
        DateAdapter(
            shuffledList.subList(0, 11),
            this,
            currentDate
        ).let { adapterTop ->
            rv_top.adapter = adapterTop
            adapterTop.notifyDataSetChanged()
        }
        DateAdapter(
            shuffledList.subList(12, 23),
            this,
            currentDate
        ).let { adapterBottom ->
            rv_bottom.adapter = adapterBottom
            adapterBottom.notifyDataSetChanged()
        }

    }

}
