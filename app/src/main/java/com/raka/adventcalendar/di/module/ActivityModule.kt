package com.raka.adventcalendar.di.module

import com.raka.adventcalendar.domain.repository.MainRepositoryImpl
import com.raka.adventcalendar.presentation.presenter.MainPresenterImpl
import com.raka.adventcalendar.presentation.view.main.MainContracts
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val view : MainContracts.view) {

    @Provides
    fun provideMainView() = view

    @Provides
    fun provideMainPresenter(repository: MainRepositoryImpl) = MainPresenterImpl(view,repository)

    @Provides
    fun provideMainRepository() = MainRepositoryImpl()

}