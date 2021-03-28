package com.example.kilofarmsandroidapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kilofarmsandroidapp.R
import com.example.kilofarmsandroidapp.models.ProductListingDataModel

class ProductListAdapter : RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    private val differCallback = object : DiffUtil.ItemCallback<ProductListingDataModel>(){
        override fun areItemsTheSame(
            oldItem: ProductListingDataModel,
            newItem: ProductListingDataModel
        ): Boolean {
            return oldItem.productId == newItem.productId
        }

        override fun areContentsTheSame(
            oldItem: ProductListingDataModel,
            newItem: ProductListingDataModel
        ): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallback)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.product_list_row_layout,
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = differ.currentList[position]
        holder.itemView.apply {

            this.findViewById<TextView>(R.id.tv_skuName).text = product.skuName
            this.findViewById<TextView>(R.id.tv_skuCategory).text = product.skuCategory
            this.findViewById<TextView>(R.id.tv_skuUnit).text = product.skuUnit
            this.findViewById<TextView>(R.id.tv_userId).text = product.user_id.toString()

        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}