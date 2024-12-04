package com.example.examen1evaluacion.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.examen1evaluacion.Models.Hotel
import com.example.examen1evaluacion.R

//Adapter para el recyclerView de activity_hoteles
class AdapterHoteles (private val hoteles: List<Hotel>): RecyclerView.Adapter<AdapterHoteles.HotelViewHolder>() {

    class HotelViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nombreHotel: TextView = view.findViewById(R.id.nombreHotel)
        val imagenHotel: ImageView = view.findViewById(R.id.imagenHotel)
        val ubicacionHotel: TextView = view.findViewById(R.id.ubicacionHotel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hotel, parent, false)
        return HotelViewHolder(view)
    }

    override fun getItemCount(): Int = hoteles.size

    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        val hotel = hoteles[position]
        holder.nombreHotel.text = hotel.toString()
    }
}