package com.example.kilofarmsandroidapp.ui

import androidx.lifecycle.ViewModel
import com.example.kilofarmsandroidapp.db.ProductDatabase
import com.example.kilofarmsandroidapp.repository.ProductRepository

class ProductViewModel(
        val productRepository: ProductRepository
) : ViewModel() {


}