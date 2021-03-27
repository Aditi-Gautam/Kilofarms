package com.example.kilofarmsandroidapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kilofarmsandroidapp.R

class DashboardFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_createProduct).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_productListing).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.btn_createProduct -> navController!!.navigate(R.id.action_dashboardFragment2_to_productFragment)
            R.id.btn_productListing -> navController!!.navigate(R.id.action_dashboardFragment2_to_productListingFragment)
        }
    }

}