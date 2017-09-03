package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.network.model

/**
 * Created by adit on 9/3/2017.
 */
data class User (
    val avatar_url:String,
    val login:String,
   val public_repos:Int
)