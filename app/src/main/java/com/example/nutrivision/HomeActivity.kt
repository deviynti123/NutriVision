package com.example.nutrivision

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSignUp = findViewById<Button>(R.id.btn_sign_up)
        val btnSignIn = findViewById<Button>(R.id.btn_sign_in)

        btnSignUp.setOnClickListener {
            // Navigasi ke SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener {
            // Navigasi ke SignInActivity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
