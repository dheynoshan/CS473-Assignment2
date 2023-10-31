package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment2.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private var foods = arrayListOf<String>()
    private lateinit var binding:ActivityMainBinding
    private var random:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        foods.addAll(arrayOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))
        binding.decide.setOnClickListener{
            random =Random.nextInt(foods.size)
            binding.textView.text= foods[random]
        }

        binding.editText.setOnClickListener{
            binding.editText.text.clear()
        }
        binding.addFood.setOnClickListener {
            val text:String = binding.editText.text.toString()
            if (!text.equals("add new food..")) {
                foods.add(text)
            }
        }

    }
}