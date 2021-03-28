package com.example.kilofarmsandroidapp.ui.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kilofarmsandroidapp.R
import com.example.kilofarmsandroidapp.ui.MainActivity
import com.example.kilofarmsandroidapp.ui.ProductViewModel

class LoginFragment : Fragment(), View.OnClickListener {

    var navController: NavController? = null
    var phoneNumber: EditText? = null
    var password: EditText? = null
    lateinit var mContext: Context
    lateinit var viewModel: ProductViewModel

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

        viewModel = (activity as MainActivity).viewModel

        phoneNumber = view.findViewById<EditText>(R.id.et_phoneNumber) as EditText
        password = view.findViewById<EditText>(R.id.et_password) as EditText
    }

    override fun onClick(v: View?) {
//       if(!validate()) {
//           Toast.makeText(mContext, "Incorrect Credentials", Toast.LENGTH_SHORT).show()
//       }
//
//       else {
            navController!!.navigate(R.id.action_loginFragment_to_dashboardFragment2)
//       }

    }

//    fun validate(): Boolean {
//        var valid = true
//        var num = true
//
//        val _phoneNumber = phoneNumber!!.text.toString()
//        val  _password = password!!.text.toString()
//
//        for (i in 0..9)
//        {
//            if(!Character.isDigit(_phoneNumber.get(i))) {
//                num =  false;
//                break;
//            }
//        }
//        if(_phoneNumber.isEmpty() || _phoneNumber.length !=10 || num) {
//            phoneNumber!!.error = "Enter a valid number"
//            valid = false
//        }
//        else {
//            phoneNumber!!.error = null
//        }
//        if(_password.isEmpty() || _password.length < 4) {
//            phoneNumber!!.error = "Password should be longer than 3 digits"
//            valid = false
//        }
//        else {
//            password!!.error = null
//        }
//
//        return valid
//    }

}