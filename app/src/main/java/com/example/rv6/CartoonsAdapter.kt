package com.example.rv6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CartoonsAdapter(private val cartoons: List<String>) : RecyclerView.Adapter<CartoonsAdapter.CartoonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartoonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sty, parent, false)
        return CartoonViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartoonViewHolder, position: Int) {
        holder.bind(cartoons[position])
    }

    override fun getItemCount(): Int {
        return cartoons.size
    }

    inner class CartoonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cartoon: String) {
            itemView.findViewById<TextView>(R.id.callMeasure).text = cartoon
        }
    }
}