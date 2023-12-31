package com.delishstudio.delish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.delishstudio.delish.view.activities.auth.SignInActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}