package com.example.kilofarmsandroidapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kilofarmsandroidapp.R
import com.example.kilofarmsandroidapp.ui.MainActivity
import com.example.kilofarmsandroidapp.ui.ProductViewModel

class ProductListingFragment : Fragment() {

    lateinit var rv_productlist: RecyclerView
    lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_listing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel

        rv_productlist = view.findViewById(R.id.rv_productList) as RecyclerView
        //rv_productlist.setlayoutManager(new Linear))
    }
}