package com.raka.adventcalendar.presentation.presenter

import com.raka.adventcalendar.presentation.view.main.MainContracts
import com.raka.adventcalendar.utilities.Utils
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(var view : MainContracts.view?, var repository : MainContracts.repository?):MainContracts.presenter {


    /**
     * get dateList from repository
     * then shuffle the list before assign it into the adapter
     */
    override fun loadData() {
        val list = repository?.getDateList()
        view?.setAdapter(list!!.shuffled(),getOnlyDate())
    }

    override fun getCurrentDate() = Utils.simpleDateConverter("dd MMMM YYYY")

    private fun getOnlyDate(): Int = Utils.simpleDateConverter("dd").toInt()

    override fun onDestroy() {
        view = null
        repository = null
    }
}