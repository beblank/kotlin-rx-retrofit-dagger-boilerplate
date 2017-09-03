package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.base

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by adit on 9/3/2017.
 */
@Module
class ApplicationModule(application:Application) {

    private var mApplication: Application = application

    @Provides
    @Singleton
    fun provideContext(): Context {
        return mApplication!!
    }
}