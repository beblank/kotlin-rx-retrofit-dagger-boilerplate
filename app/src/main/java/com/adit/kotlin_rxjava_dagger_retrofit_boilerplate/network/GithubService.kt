package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.network

import com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.network.model.User
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by adit on 9/3/2017.
 */
interface GithubService {
    @GET("users/{username}")
    fun userData(@Path("username") username:String): Observable<User>
}