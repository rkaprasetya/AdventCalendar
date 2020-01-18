package com.raka.adventcalendar.presentation.presenter

import com.raka.adventcalendar.presentation.view.main.MainContracts
import com.raka.adventcalendar.utilities.Utils

class MainPresenterImpl(var view : MainContracts.view, var repository : MainContracts.repository):MainContracts.presenter {
    override fun onDestroy() {
    }

    override fun loadData() {
    }

    override fun getCurrentDate() = Utils.simpleDateConverter("dd MMMM YYYY")

    private fun getOnlyDate(): Int = Utils.simpleDateConverter("dd").toInt()
}