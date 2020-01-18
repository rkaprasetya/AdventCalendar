package com.raka.adventcalendar.presentation.view.main

import com.raka.adventcalendar.model.DateItem

interface MainContracts {

    interface presenter{
        fun onDestroy()
        fun loadData()
        fun getCurrentDate(): String
    }

    interface view{
        fun setAdapter(shuffledList: List<DateItem>,onlyDate:Int)
    }

    interface repository{
        fun getDateList():List<DateItem>
    }
}