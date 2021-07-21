package com.example.math_pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*

class MainActivity4 : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0
    var foyKiritganJavob = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        random()
        button.setOnClickListener {
            foyKiritganJavob = editing.text.toString().toInt()
            if (foyKiritganJavob == javob){

                Toast.makeText(this, "\uD83E\uDD13  \uD83E\uDD13  \uD83E\uDD13", Toast.LENGTH_SHORT).show()
                editing.setText("")
            }else Toast.makeText(this, "\uD83D\uDE48  \uD83D\uDE48  \uD83D\uDE48", Toast.LENGTH_SHORT).show(); editing.setText("")
            random()
        }
    }
    fun random(){
        number1 = Random().nextInt(20)
        number2 = Random().nextInt(20)
        amal = Random().nextInt(4)
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
            2->{
                if (number1>number2){
                    if(number1%number2 == 0){
                    javob = number1 / number2
                    text.text = "$number1 ➗ $number2"
                }}else random()
            }
            3->{
                javob = number1 * number2
                text.text = "$number1 ✖ $number2"
            }
        }
    }
}