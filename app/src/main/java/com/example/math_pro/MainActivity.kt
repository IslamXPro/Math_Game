package com.example.math_pro

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mediaPlayer1 = MediaPlayer.create(this,R.raw.mac_startup)
        mediaPlayer1.start()
        exit_app.setOnClickListener {
            finish()
        }
    }
    fun goLevel(view: View){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

}