package com.vn.mvvm_databinding_demo.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.vn.mvvm_databinding_demo.R
import com.vn.mvvm_databinding_demo.databinding.ActivityLoginBinding
import net.simplifiedcoding.mvvmsampleapp.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel;
        viewModel.authListener = this

    }

    override fun onStarted() {
        toast("start login")
    }

    override fun onSuccess() {
        toast("Login success")

    }

    override fun onFailure(message: String) {
        toast(message)
    }
}
