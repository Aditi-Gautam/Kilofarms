package com.example.kilofarmsandroidapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation


class ProductFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null
    lateinit var category: Spinner
    lateinit var mContext: Context
    lateinit var selectedCategory: String

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_submit).setOnClickListener(this)

        category = view.findViewById(R.id.sp_category) as Spinner

        val options = arrayOf("Option A", "Option B", "Option C")
        val spinnerAdapter: ArrayAdapter<String> = ArrayAdapter<String>(
            mContext, android.R.layout.simple_list_item_1, options
        )

        category.adapter = spinnerAdapter

        category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                selectedCategory = options[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(mContext, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onClick(v: View?) {

        navController!!.navigate(R.id.action_productFragment_to_productListingFragment)

    }

}