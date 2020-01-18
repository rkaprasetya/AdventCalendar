package com.raka.adventcalendar.di.component

import com.raka.adventcalendar.AdventCalendarApplication
import com.raka.adventcalendar.di.module.ApplicationModule
import com.raka.adventcalendar.di.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: AdventCalendarApplication)
}