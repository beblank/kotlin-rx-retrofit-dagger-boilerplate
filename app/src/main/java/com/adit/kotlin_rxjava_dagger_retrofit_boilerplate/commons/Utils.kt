package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.commons

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

/**
 * Created by adit on 9/3/2017.
 */
class Utils {
    companion object {
        fun buildClient(): OkHttpClient.Builder{
            val clientBuilder = OkHttpClient.Builder()
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            clientBuilder.addInterceptor(loggingInterceptor)
            return clientBuilder
        }
    }
}