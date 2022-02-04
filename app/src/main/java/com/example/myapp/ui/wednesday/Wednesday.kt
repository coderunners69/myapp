package com.example.myapp.ui.wednesday

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.databinding.FragmentWednesdayBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Wednesday : Fragment() {

    private lateinit var slideshowViewModel: WednesdayViewModel
    private var _binding: FragmentWednesdayBinding? = null
    lateinit var db: DatabaseReference
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProvider(this).get(WednesdayViewModel::class.java)

        _binding = FragmentWednesdayBinding.inflate(inflater, container, false)
        val root: View = binding.root
        displayStuff()
        /*val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }
    fun displayStuff()
    {
        db= FirebaseDatabase.getInstance().getReference("Menu")
        db.child("wednesday").child("breakfast").get().addOnSuccessListener {
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
        db.child("wednesday").child("lunch").get().addOnSuccessListener {
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
        db.child("wednesday").child("dinner").get().addOnSuccessListener {
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
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}