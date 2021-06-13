package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnNext: Button
    lateinit var imageView: ImageView
    lateinit var tvTeacher: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pic1()
        click()
    }
    fun pic1(){
        btnNext=findViewById(R.id.btnNext)
        imageView=findViewById(R.id.imageView)
        tvTeacher=findViewById(R.id.tvTeacher)
    }
    fun click(){
        btnNext.setOnClickListener {
            val Next= Intent(baseContext,photo1::class.java)
            startActivity(Next)
        }
}}