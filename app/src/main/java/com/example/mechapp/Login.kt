package com.example.mechapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.logInBtn)

        button.setOnClickListener {
            val intent = Intent(this, actictivity_Status::class.java)

            startActivity(intent)
        }
        /*Buttons*/
        fun nextButton(view: View){
            val button = findViewById<Button>(R.id.logInBtn)

            button.setOnClickListener {
                val intent = Intent

                startActivity(intent)

            }
        }
    }
}

