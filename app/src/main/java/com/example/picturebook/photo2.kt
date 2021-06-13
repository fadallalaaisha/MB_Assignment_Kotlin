package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class photo2 : AppCompatActivity() {

    lateinit var btnNext2: Button
    lateinit var btnBack2: Button
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView
    lateinit var tvme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo2)

        pic3()
        click3()
    }
    fun pic3(){
        btnBack2=findViewById(R.id.btnBack2)
        btnNext2=findViewById(R.id.btnNext2)
        imageView3=findViewById(R.id.imageView3)
        imageView4=findViewById(R.id.imageView4)
        tvme=findViewById(R.id.tvme)
    }
    fun click3(){
        btnNext2.setOnClickListener {
            val Next= Intent(baseContext,photo3::class.java)
            startActivity(Next)
        }
        btnBack2.setOnClickListener {
            val Back= Intent(baseContext,photo3::class.java)
            startActivity(Back)
        }
    }
}