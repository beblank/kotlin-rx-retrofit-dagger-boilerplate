package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.base

import android.app.Application

/**
 * Created by adit on 9/3/2017.
 */
class App:Application(){

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    companion object {
        var component:ApplicationComponent? = null
    }

    fun getComponent():ApplicationComponent =  component!!

}