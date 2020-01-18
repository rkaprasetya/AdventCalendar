package com.raka.adventcalendar.domain.repository

import com.raka.adventcalendar.R
import com.raka.adventcalendar.model.DateItem
import com.raka.adventcalendar.presentation.view.main.MainContracts

class MainRepositoryImpl:MainContracts.repository {
    override fun getDateList(): List<DateItem> = mutableListOf(
        DateItem(
            R.drawable.ic_date_1_front,
            R.drawable.ic_date_1_back, 1
        ),
        DateItem(
            R.drawable.ic_date_2_front,
            R.drawable.ic_date_2_back, 2
        ),
        DateItem(
            R.drawable.ic_date_3_front,
            R.drawable.ic_date_3_back, 3
        ),
        DateItem(
            R.drawable.ic_date_4_front,
            R.drawable.ic_date_4_back, 4
        ),
        DateItem(
            R.drawable.ic_date_5_front,
            R.drawable.ic_date_5_back, 5
        ),
        DateItem(
            R.drawable.ic_date_6_front,
            R.drawable.ic_date_6_back, 6
        ),
        DateItem(
            R.drawable.ic_date_7_front,
            R.drawable.ic_date_7_back, 7
        ),
        DateItem(
            R.drawable.ic_date_8_front,
            R.drawable.ic_date_8_back, 8
        ),
        DateItem(
            R.drawable.ic_date_9_front,
            R.drawable.ic_date_9_back, 9
        ),
        DateItem(
            R.drawable.ic_date_10_front,
            R.drawable.ic_date_10_back, 10
        ),
        DateItem(
            R.drawable.ic_date_11_front,
            R.drawable.ic_date_11_back, 11
        ),
        DateItem(
            R.drawable.ic_date_12_front,
            R.drawable.ic_date_12_back, 12
        ),
        DateItem(
            R.drawable.ic_date_13_front,
            R.drawable.ic_date_1_back, 13
        ),
        DateItem(
            R.drawable.ic_date_14_front,
            R.drawable.ic_date_2_back, 14
        ),
        DateItem(
            R.drawable.ic_date_15_front,
            R.drawable.ic_date_3_back, 15
        ),
        DateItem(
            R.drawable.ic_date_16_front,
            R.drawable.ic_date_4_back, 16
        ),
        DateItem(
            R.drawable.ic_date_17_front,
            R.drawable.ic_date_5_back, 17
        ),
        DateItem(
            R.drawable.ic_date_18_front,
            R.drawable.ic_date_6_back, 18
        ),
        DateItem(
            R.drawable.ic_date_19_front,
            R.drawable.ic_date_7_back, 19
        ),
        DateItem(
            R.drawable.ic_date_20_front,
            R.drawable.ic_date_8_back, 20
        ),
        DateItem(
            R.drawable.ic_date_21_front,
            R.drawable.ic_date_9_back, 21
        ),
        DateItem(
            R.drawable.ic_date_22_front,
            R.drawable.ic_date_10_back, 22
        ),
        DateItem(
            R.drawable.ic_date_23_front,
            R.drawable.ic_date_11_back, 23
        ),
        DateItem(
            R.drawable.ic_date_24_front,
            R.drawable.ic_date_12_back, 24
        )
    )
}