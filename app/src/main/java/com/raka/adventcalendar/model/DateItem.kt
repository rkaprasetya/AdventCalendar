package com.raka.adventcalendar.model

data class DateItem(
    val imgFront: Int,
    val imgBack: Int,
    val dateValue: Int,
    var isFlipped: Boolean = false
)