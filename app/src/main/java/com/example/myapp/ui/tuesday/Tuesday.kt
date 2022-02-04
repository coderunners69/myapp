package com.example.myapp.ui.tuesday

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.databinding.FragmentTuesdayBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Tuesday : Fragment() {

    private lateinit var galleryViewModel: TuesdayViewModel
    private var _binding: FragmentTuesdayBinding? = null
    lateinit var db: DatabaseReference
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProvider(this).get(TuesdayViewModel::class.java)

        _binding = FragmentTuesdayBinding.inflate(inflater, container, false)
        val root: View = binding.root
        displayStuff()
        /*val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }
    fun displayStuff()
    {
        db= FirebaseDatabase.getInstance().getReference("Menu")
        db.child("tuesday").child("breakfast").get().addOnSuccessListener {
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
        db.child("tuesday").child("lunch").get().addOnSuccessListener {
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
        db.child("tuesday").child("dinner").get().addOnSuccessListener {
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