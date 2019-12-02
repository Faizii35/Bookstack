package com.it.bookstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity

class SplashActivity : AppCompatActivity() {

    private val splashTime=2000L // 2 seconds
    private lateinit var myHandler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            myHandler = Handler()

            myHandler.postDelayed({
                goToMainActivity()
            },splashTime)
        }

    private fun goToMainActivity(){
        val splashActivityIntent = Intent (this , LoginActivity::class.java)
        startActivity(splashActivityIntent)
        finish()
    }
}

