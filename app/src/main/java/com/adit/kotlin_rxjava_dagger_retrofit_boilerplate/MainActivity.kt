package com.adit.kotlin_rxjava_dagger_retrofit_boilerplate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.base.App
import com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.commons.RxBaseActivity
import com.adit.kotlin_rxjava_dagger_retrofit_boilerplate.network.GithubService
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

class MainActivity : RxBaseActivity() {

    @Inject
    lateinit var mGithubService:GithubService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inject()
    }

    override fun onResume() {
        super.onResume()
        getGithubData()
    }

    private fun getGithubData() {
        subscriptions.add(mGithubService.userData("JetBrains")!!
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("on next", "$it")
                },{
                    error ->
                    Log.e("error", "$error")
                }))
    }

    private fun inject() {
        App.component?.inject(this)
    }


}
