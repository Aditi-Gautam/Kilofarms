package com.example.kilofarmsandroidapp.network

import com.example.kilofarmsandroidapp.models.ProductListingDataModel
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface Api {

    @GET("staging/vegetable")
    suspend fun getProductDetails(
        @Query("item")
        item: String = "all",
        @Query("userId")
        userId: Int = 114118006
    ): Response<List<ProductListingDataModel>>

//    @Headers("Content-Type: application/json")
//    @POST("staging/vegetables")
//    suspend fun addProduct(@Body requestBody: RequestBody): Response<ResponseBody>
}