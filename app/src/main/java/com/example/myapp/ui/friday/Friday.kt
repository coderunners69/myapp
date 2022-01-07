package com.example.myapp.ui.friday

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.R
import com.example.myapp.databinding.FragmentFridayBinding
import com.example.myapp.ui.friday.FridayViewModel

class Friday : Fragment() {

    /*companion object {
        fun newInstance() = test2()
    }*/

    private lateinit var friViewModel: FridayViewModel
    private var _binding: FragmentFridayBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        friViewModel =
            ViewModelProvider(this).get(FridayViewModel::class.java)

        _binding = FragmentFridayBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textTest
        test2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    /*override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Test2ViewModel::class.java)
        // TODO: Use the ViewModel
    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}