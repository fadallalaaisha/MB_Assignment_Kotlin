package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class photo4 : AppCompatActivity() {

    lateinit var btnBack5: Button
    lateinit var imageView6: ImageView
    lateinit var tvHouse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo5)


        pic5()
        click5()
    }
fun pic5(){
    btnBack5=findViewById(R.id.btnBack5)
    imageView6=findViewById(R.id.imageView6)
    tvHouse=findViewById(R.id.tvHouse)
}
fun click5(){
    btnBack5.setOnClickListener {
        val Back= Intent(baseContext,photo3::class.java)
        startActivity(Back)
    }
}
}

