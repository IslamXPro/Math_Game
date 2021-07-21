package com.example.math_pro

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*

class MainActivity3 : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0
    var foyKiritganJavob = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var mediaPlayer2 = MediaPlayer.create(this,R.raw.correct)
        var mediaPlayer3 = MediaPlayer.create(this,R.raw.fail)
        random()
        button.setOnClickListener {
            foyKiritganJavob = editing.text.toString().toInt()
            if (foyKiritganJavob == javob){

                Toast.makeText(this, "CORRECT \uD83D\uDC4F\uD83D\uDC4F\uD83D\uDC4F", Toast.LENGTH_SHORT).show()
                mediaPlayer2.start()
                editing.setText("")
            }else {Toast.makeText(this, "FAIL \uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D", Toast.LENGTH_SHORT).show(); editing.setText("")
            mediaPlayer3.start()
            }
            random()
        }
    }
    fun random(){
        number1 = Random().nextInt(20)
        number2 = Random().nextInt(20)
        amal = Random().nextInt(2)
        ekrangaChiqarish()
    }
    fun ekrangaChiqarish(){

        when(amal){
            0->{
                javob = number1 + number2
                text.text = "$number1 ➕ $number2"
            }
            1->{
                if (number1>0){
                    if (number1>number2){
                        javob = number1 - number2
                        text.text = "$number1 ➖ $number2"}else random()
                }}
        }
    }


}