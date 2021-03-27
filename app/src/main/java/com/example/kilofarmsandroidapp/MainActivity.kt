package com.example.kilofarmsandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.kilofarmsandroidapp.network.Api
import com.example.kilofarmsandroidapp.utils.ApiUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import okhttp3.logging.HttpLoggingInterceptor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        withContext(Dispatchers.IO) {
//            var get_response = Api.allProductDetails()
//        }
    }

//    fun onregisterbuttonclicked() = lifecycleScope.launch {
//
//
//
//
//            val httpsinterceptor =
//                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//
//            val client = ApiUtils.provideOkHttpClient(httpsinterceptor)
//
//            val gson = ApiUtils.provideGson()
//
//            val retrofit = ApiUtils.provideRetrofit(client, gson)
//
//            val response = withContext(Dispatchers.IO) {
//                retrofit.getProductDetails()
//            }
//
//            }
//
//        }
//    }
//
//    fun String.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
//}
}