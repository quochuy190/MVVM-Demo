package com.vn.mvvm_databinding_demo.ui.auth

import androidx.lifecycle.LiveData


interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}