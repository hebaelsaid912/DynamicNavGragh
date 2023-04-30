package com.hebaelsaid.dynamicnavgragh

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

const val TAG = "AppMainFragment"
class AppMainFragment : Fragment() {
    lateinit var lib1Btn : Button
    lateinit var lib2Btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lib1Btn = view.findViewById(R.id.lib1)
        lib2Btn = view.findViewById(R.id.lib2)
        lib1Btn.setOnClickListener {
            Log.d(TAG, "lib1Btn clicked!")
            findNavController().navigate(deepLink = Uri.parse(getString(com.hebaelsaid.library1.R.string.deeplink_first_fragment_lib1)))
        }
        lib2Btn.setOnClickListener {
            Log.d(TAG, "lib2Btn clicked!")
            findNavController().navigate(deepLink = Uri.parse(getString(com.hebaelsaid.library2.R.string.deeplink_second_fragment_lib2)))
        }
    }

}