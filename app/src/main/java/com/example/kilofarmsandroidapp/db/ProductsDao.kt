package com.example.kilofarmsandroidapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kilofarmsandroidapp.models.ProductListingDataModel


@Dao
interface ProductsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(productListingDataModel: ProductListingDataModel):Long //Update and Insert function

    @Query("SELECT * From product_list")
    fun getAllProducts(): LiveData<List<ProductListingDataModel>>
}