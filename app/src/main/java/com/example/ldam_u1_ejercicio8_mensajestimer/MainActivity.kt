package com.example.ldam_u1_ejercicio8_mensajestimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.ldam_u1_ejercicio8_mensajestimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
       lateinit var binding: ActivityMainBinding
       var contador=0
       var vector = arrayOf("Ella","Es","Callaita","Pero","De","Noche","Atrevida","7u7")
       val timer = object:CountDownTimer(8000,1000){
           override fun onTick(p0: Long) {
               //Cuanto intervalo 0
               binding.tv.text=vector[contador]
               contador++
           }

           override fun onFinish() {
               contador=0
            start()
           }

       }


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            timer.start()
        }
    }
}