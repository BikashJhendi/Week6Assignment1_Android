package com.bikash.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            if(etUsername.text.toString() == "softwarica" && etPassword.text.toString() == "coventry"){
                val intent = Intent(this, TabLayoutActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(applicationContext, "Wrong Credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

}