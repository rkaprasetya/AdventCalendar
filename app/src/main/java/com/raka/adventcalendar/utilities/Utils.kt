package com.raka.adventcalendar.utilities

import java.text.SimpleDateFormat
import java.util.*

object Utils {

    fun simpleDateConverter(formatDate: String) = SimpleDateFormat(formatDate, Locale.ENGLISH).format(
        Date()
    )
}