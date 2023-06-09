package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resault.*

class Resault : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resault)
        window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(setData.name)
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        congo.text="Congratulation ${userName}!!"
        Score.text="${score}/${totalQuestion}"
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}