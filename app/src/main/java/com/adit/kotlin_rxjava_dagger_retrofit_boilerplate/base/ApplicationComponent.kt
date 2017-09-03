package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.base

import com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by adit on 9/3/2017.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent{
    fun inject(target: MainActivity)
}