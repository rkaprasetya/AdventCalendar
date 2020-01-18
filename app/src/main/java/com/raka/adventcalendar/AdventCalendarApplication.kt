package com.raka.adventcalendar

import android.app.Application
import com.raka.adventcalendar.di.component.ApplicationComponent
import com.raka.adventcalendar.di.component.DaggerApplicationComponent
import com.raka.adventcalendar.di.module.ApplicationModule

@Suppress("DEPRECATION")
class AdventCalendarApplication:Application() {

    lateinit var component: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        setupDagger()
    }

    private fun setupDagger() {
        component = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this))
            .build()
        component.inject(this)
    }

    fun getApplicationComponent() = component
}