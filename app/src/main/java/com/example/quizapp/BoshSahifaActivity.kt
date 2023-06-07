package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.BoshsohifaBinding
import kotlinx.android.synthetic.main.activity_main.*

class BoshSahifaActivity: AppCompatActivity() {
    private lateinit var binding: BoshsohifaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=BoshsohifaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.test1.setOnClickListener {

            startActivity(Intent(baseContext,QuestionActivity::class.java))
            finish()
            }
        binding.test2.setOnClickListener {
            startActivity(Intent(baseContext,QuestionActivity1::class.java))
            finish()
            }
        binding.test3.setOnClickListener {
            startActivity(Intent(baseContext,QustionActivity2::class.java))
            finish()
            }
        }
    }
