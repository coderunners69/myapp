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
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Friday : Fragment() {

    /*companion object {
        fun newInstance() = test2()
    }*/

    private lateinit var friViewModel: FridayViewModel
    private var _binding: FragmentFridayBinding? = null
    lateinit var db: DatabaseReference
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
        displayStuff()
        /*val textView: TextView = binding.textTest
        test2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }
    fun displayStuff()
    {
        db= FirebaseDatabase.getInstance().getReference("Menu")
        db.child("friday").child("breakfast").get().addOnSuccessListener {
            if(it.exists())
            {
                val item1 = it.child("item_1").value
                val item2 = it.child("item_2").value
                val item3 = it.child("item_3").value
                val item4 = it.child("item_4").value
                val item5 = it.child("item_5").value

                binding.textView3.text=item1.toString()
                binding.textView4.text=item2.toString()
                binding.textView5.text=item3.toString()
                binding.textView6.text=item4.toString()
                binding.textView7.text=item5.toString()

            }
        }
        db.child("friday").child("lunch").get().addOnSuccessListener {
            if(it.exists())
            {
                val item1 = it.child("item_1").value
                val item2 = it.child("item_2").value
                val item3 = it.child("item_3").value
                val item4 = it.child("item_4").value
                val item5 = it.child("item_5").value

                binding.textView14.text=item1.toString()
                binding.textView16.text=item2.toString()
                binding.textView17.text=item3.toString()
                binding.textView18.text=item4.toString()
                binding.textView19.text=item5.toString()

            }
        }
        db.child("friday").child("dinner").get().addOnSuccessListener {
            if(it.exists())
            {
                val item1 = it.child("item_1").value
                val item2 = it.child("item_2").value
                val item3 = it.child("item_3").value
                val item4 = it.child("item_4").value
                val item5 = it.child("item_5").value

                binding.textView27.text=item1.toString()
                binding.textView28.text=item2.toString()
                binding.textView29.text=item3.toString()
                binding.textView30.text=item4.toString()
                binding.textView31.text=item5.toString()

            }
        }
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