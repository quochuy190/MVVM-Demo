package com.vn.mvvm_databinding_demo.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * Created by: Neo Company.
 * Developer: HuyNQ2
 * Date: 30-December-2019
 * Time: 16:40
 * Version: 1.0
 */
class AuthViewModel : ViewModel() {
    var email: String? = null
    var password: String? = null
    var authListener: AuthListener? = null;

    fun onLoginButtonClick(view: View) {
        authListener?.onStarted();
        if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
            authListener?.onFailure("Invalid email or password")
            return
        }
        authListener?.onSuccess()

    }

}