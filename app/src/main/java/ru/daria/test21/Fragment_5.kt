package ru.dara.test21

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import android.content.Context


class Fragment_5 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    val view = inflater.inflate(R.layout.fragment_5, container, false)
    var applicationContext: Context
    applicationContext = requireContext()
    val login = Fragment_5Args.fromBundle(requireArguments()).login1
   
    val Text_1 = view.findViewById<TextView>(R.id.text_f5_2)
    Text_1.text = login


    val Button_1 = view.findViewById<Button>(R.id.button_f5_1)
    val Button_2 = view.findViewById<Button>(R.id.button_f5_2)
    val Button_3 = view.findViewById<Button>(R.id.button_f5_3)
    val Button_4 = view.findViewById<Button>(R.id.button_f5_4)

     Button_1.setOnClickListener {
        val navController = view.findNavController() // 
        navController.navigate(R.id.action_fragment_5_to_fragment_6)
}
     Button_2.setOnClickListener {
        val navController = view.findNavController() // 
        navController.navigate(R.id.action_fragment_5_to_fragment_7)
}
     Button_3.setOnClickListener {
        val navController = view.findNavController() // 
        navController.navigate(R.id.action_fragment_5_to_fragment_8)
}
     Button_4.setOnClickListener {
        val navController = view.findNavController() // 
        navController.navigate(R.id.action_fragment_5_to_fragment_9)
}


        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = Fragment_4()
    }
}