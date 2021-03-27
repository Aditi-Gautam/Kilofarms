package com.example.kilofarmsandroidapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductListingDataModel(

    val skuName: String,
    val user_id: Int,
    val skuUnit: String,
    val skuCategory: String
)