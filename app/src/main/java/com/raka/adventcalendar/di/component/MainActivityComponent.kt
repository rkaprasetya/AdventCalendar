package com.raka.adventcalendar.di.component

import com.raka.adventcalendar.di.module.ActivityModule
import com.raka.adventcalendar.di.scope.ActivityScope
import com.raka.adventcalendar.presentation.view.main.MainActivity
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class],dependencies = [ApplicationComponent::class])
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}