package com.example.kilofarmsandroidapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kilofarmsandroidapp.repository.ProductRepository

class ProductViewModelProviderFactory(
        val productRepository: ProductRepository
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProductViewModel(productRepository) as T
    }
}