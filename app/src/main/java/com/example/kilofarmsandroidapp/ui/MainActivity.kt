package com.example.kilofarmsandroidapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kilofarmsandroidapp.R
import com.example.kilofarmsandroidapp.db.ProductDatabase
import com.example.kilofarmsandroidapp.repository.ProductRepository

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productRepository = ProductRepository(ProductDatabase(this))
        val viewModelProviderFactory = ProductViewModelProviderFactory(productRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(ProductViewModel::class.java)





//        withContext(Dispatchers.IO) {
//            var get_response = Api.allProductDetails()
//        }
//    }
//    fun onregisterbuttonclicked() = lifecycleScope.launch {
//            val httpsinterceptor =
//                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//            val client = ApiUtils.provideOkHttpClient(httpsinterceptor)
//            val gson = ApiUtils.provideGson()
//            val retrofit = ApiUtils.provideRetrofit(client, gson)
//            val response = withContext(Dispatchers.IO) {
//                retrofit.getProductDetails()
//            }
//            }
//        }
//    }
//    fun String.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }
}