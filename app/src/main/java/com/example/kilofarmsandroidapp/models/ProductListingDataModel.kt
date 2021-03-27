package com.example.kilofarmsandroidapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(
        tableName = "product_list"
)
data class ProductListingDataModel(

        @PrimaryKey(autoGenerate = true)
        val productId: Int? = null,
        val skuName: String,
        val user_id: Int,
        val skuUnit: String,
        val skuCategory: String
)