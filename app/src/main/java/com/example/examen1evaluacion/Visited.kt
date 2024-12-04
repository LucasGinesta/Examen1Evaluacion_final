package com.example.examen1evaluacion

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examen1evaluacion.Models.Hotel

class Visited : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_visited)

        //Aqui esta la lista de los hoteles pero no he sabido aplicarlo al recyclerView
        val hoteles = listOf(
            Hotel(R.drawable.hotel1, "Uno", "Calle 1"),
            Hotel(R.drawable.hotel2, "Dos", "Calle 2"),
            Hotel(R.drawable.hotel3, "Tres", "Calle 3"),
            Hotel(R.drawable.hotel4, "Cuatro", "Calle 4"),
            Hotel(R.drawable.hotel5, "Cinco", "Calle 5")
        )

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}