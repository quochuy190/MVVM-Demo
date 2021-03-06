package com.vn.mvvm_databinding_demo.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by: Neo Company.
 * Developer: HuyNQ2
 * Date: 07-January-2020
 * Time: 09:58
 * Version: 1.0
 */
interface MyApi {
    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email: String,
        @Field("password") password:String
    ):Call<ResponseBody>

    companion object {
        operator fun invoke():MyApi{
            return Retrofit.Builder()
                .baseUrl("https://api.simplifiedcoding.in/course-apis/mvvm/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyApi::class.java)
        }
    }
}