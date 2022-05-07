package com.example.halloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var  btnExchange:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent = Intent(this,BMIculculatorActvity::class.java)
            startActivity(intent)
        }
        btnExchange=findViewById(R.id.btnExchange)
        btnExchange.setOnClickListener {
            val intent=Intent(this,sendMoney::class.java)
            startActivity(intent)
        }
    }
}