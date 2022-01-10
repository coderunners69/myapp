package com.example.myapp.ui.thursday

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.databinding.FragmentThursdayBinding

class Thursday : Fragment() {

    /*companion object {
        fun newInstance() = test2()
    }*/

    private lateinit var test2ViewModel: ThursdayViewModel
    private var _binding: FragmentThursdayBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        test2ViewModel =
            ViewModelProvider(this).get(ThursdayViewModel::class.java)

        _binding = FragmentThursdayBinding.inflate(inflater, container, false)
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