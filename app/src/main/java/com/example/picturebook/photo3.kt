package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class photo3 : AppCompatActivity() {

    lateinit var btnBack3: Button
    lateinit var imageView5: ImageView
    lateinit var tvCity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo4)
        pic5()
        click5()
    }

    fun pic5(){
        btnBack3=findViewById(R.id.btnBack3)
        imageView5=findViewById(R.id.imageView5)
        tvCity=findViewById(R.id.tvCity)
    }
    fun click5(){
        btnBack3.setOnClickListener {
            val Back= Intent(baseContext,photo4::class.java)
            startActivity(Back)
        }
    }
}