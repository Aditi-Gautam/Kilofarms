package com.example.kilofarmsandroidapp.utils

import com.example.kilofarmsandroidapp.network.Api
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class ApiUtils {
//    companion object {
//        const val BASE_URL = "YOUR_BASE_URL"
//        const val LOGIN_URL = "login/"
//        const val SIGNUP_URL = "signup/"
//
//
//        fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient =
//            OkHttpClient.Builder()
//                .addInterceptor(interceptor)
//                .callTimeout(10, TimeUnit.SECONDS)
//                .readTimeout(5, TimeUnit.SECONDS)
//                .writeTimeout(5, TimeUnit.SECONDS)
//                .build()
//
//        fun provideGson(): Gson = GsonBuilder()
//            .enableComplexMapKeySerialization()
//            .disableHtmlEscaping()
//            .create()

//        fun provideRetrofit(okhttpClient: OkHttpClient, gson: Gson): Api = Retrofit.Builder()
//            .client(okhttpClient)
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .build().createApi::class.java)
    //}
}