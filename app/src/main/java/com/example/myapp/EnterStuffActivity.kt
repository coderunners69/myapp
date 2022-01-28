package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.databinding.ActivityEnterStuffBinding
import com.example.myapp.ui.Stuff_and_days
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class EnterStuffActivity : AppCompatActivity() {
    lateinit var binding: ActivityEnterStuffBinding
    lateinit var db: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEnterStuffBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener {
            submit()
        }
    }
    fun submit()
    {
        val day = binding.day.text.toString()
        val time = binding.time.text.toString()
        val item1=binding.item1.text.toString()
        val item2=binding.item2.text.toString()
        val item3=binding.item3.text.toString()
        val item4=binding.item4.text.toString()
        val item5=binding.item5.text.toString()

        val obj = Stuff(item1,item2,item3,item4,item5)

        db=FirebaseDatabase.getInstance().getReference("Menu")
        db.child(day).child(time).setValue(obj).addOnSuccessListener {
            binding.day.text.clear()
            binding.time.text.clear()
            binding.item1.text.clear()
            binding.item2.text.clear()
            binding.item3.text.clear()
            binding.item4.text.clear()
            binding.item5.text.clear()
        }


    }
}