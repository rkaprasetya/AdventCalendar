package com.raka.adventcalendar.di.module

import android.content.Context
import com.raka.adventcalendar.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @ApplicationScope
    fun getContext() = context
}