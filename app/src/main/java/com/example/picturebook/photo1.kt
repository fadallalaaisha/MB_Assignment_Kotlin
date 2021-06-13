package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class photo1 : AppCompatActivity() {

    lateinit var btnNext1: Button
    lateinit var btnBack1: Button
    lateinit var imageView2: ImageView
    lateinit var tvLaptop: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo1)

        pic2()
        click2()
    }

    fun pic2(){
        btnNext1=findViewById(R.id.btnNext1)
        imageView2=findViewById(R.id.imageView2)
        tvLaptop=findViewById(R.id.tvLaptop)
        btnBack1=findViewById(R.id.btnBack1)
    }
    fun click2(){
        btnNext1.setOnClickListener {
            val Next= Intent(baseContext,photo2::class.java)
           startActivity(Next)
        }
}}