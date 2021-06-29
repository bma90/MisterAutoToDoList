package com.bmaexperiences.misterautotodolist.global

import android.content.Context
import android.net.*
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class GlobalActivity : AppCompatActivity() {

    protected lateinit var viewModel : GlobalViewModel

    private lateinit var cm : ConnectivityManager

    abstract fun updateConnection(isConnected : Boolean = false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = GlobalViewModel(application)

        cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val builder = NetworkRequest.Builder().addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET).build()
        cm.registerNetworkCallback(builder, internetCallBack)
        if (cm.allNetworks.isEmpty()) updateConnection()
    }

    /**
     * unregister the connectivity callback
     */
    override fun onStop() {
        super.onStop()
        cm.unregisterNetworkCallback(internetCallBack)
    }

    //---------------------------------------- internet connectivity callback
    /**
     * Allow our activity to check if the device is connected to internet or not
     */
    private val internetCallBack = object : ConnectivityManager.NetworkCallback(){
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
            updateConnection(true)
        }

        override fun onLost(network: Network) {
            super.onLost(network)
            updateConnection()
        }

    }


}