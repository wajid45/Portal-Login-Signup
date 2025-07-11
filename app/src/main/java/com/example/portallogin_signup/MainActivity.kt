package com.example.portallogin_signup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(100)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        val loginbtn: Button = findViewById(R.id.loginbtn1)
        loginbtn.setOnClickListener {
            val i: Intent = Intent(this, loginPage::class.java)
            startActivity(i)
        }

        val signupbtn : Button = findViewById(R.id.signupbtn1)
        signupbtn.setOnClickListener {
            val i: Intent = Intent(this, signup_page::class.java)
            startActivity(i)
        }

        val guestbtn : Button = findViewById(R.id.guestbtn)
        guestbtn.setOnClickListener {
            val i: Intent = Intent(this, Home_Page::class.java)
            startActivity(i)
        }

    }
}