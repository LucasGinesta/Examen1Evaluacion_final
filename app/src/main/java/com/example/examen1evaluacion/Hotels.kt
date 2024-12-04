package com.example.examen1evaluacion

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examen1evaluacion.Adapters.AdapterHoteles
import com.example.examen1evaluacion.Models.Hotel

class Hotels : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hotels)

        //Aqui esta la lista de los hoteles pero no he sabido aplicarlo al recyclerView
        val hoteles = listOf(
            Hotel(R.drawable.hotel1, "Uno", "Calle 1"),
            Hotel(R.drawable.hotel2, "Dos", "Calle 2"),
            Hotel(R.drawable.hotel3, "Tres", "Calle 3"),
            Hotel(R.drawable.hotel4, "Cuatro", "Calle 4"),
            Hotel(R.drawable.hotel5, "Cinco", "Calle 5")
        )

        //Configuracion del boton para pasar a la valoracion de los hoteles
        val buttonHotel = findViewById<ImageButton>(R.id.imageButton)
        buttonHotel.setOnClickListener({lanzarHoteles()})

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //Metodo que permite al boton Login navegar a activity_hotels
    fun lanzarHoteles() {
        val i = Intent(this, Visited::class.java)
        startActivity(i)
    }




}