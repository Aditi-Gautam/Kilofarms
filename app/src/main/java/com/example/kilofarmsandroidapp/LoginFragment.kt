package com.example.kilofarmsandroidapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlin.properties.Delegates

class LoginFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null
    lateinit var phoneNumber: String
    lateinit var password: String
    lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_login).setOnClickListener(this)

        phoneNumber = view.findViewById<EditText>(R.id.et_phoneNumber).text.toString()
        password = view.findViewById<EditText>(R.id.et_password).text.toString()
    }

    override fun onClick(v: View?) {
//        if(phoneNumber.length < 10)
//        {
//            Toast.makeText(mContext, "Incorrect phone number", Toast.LENGTH_SHORT).show()
//            view?.findViewById<EditText>(R.id.et_phoneNumber)?.requestFocus()
//        }
//        else if(password.isEmpty())
//        {
//            Toast.makeText(mContext, "Incorrect password", Toast.LENGTH_SHORT).show()
//            view?.findViewById<EditText>(R.id.et_password)?.requestFocus()
//        }
//
//        else {
            navController!!.navigate(R.id.action_loginFragment_to_productFragment)
//        }

    }

}