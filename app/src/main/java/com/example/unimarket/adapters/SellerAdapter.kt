package com.example.unimarket.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.unimarket.R
import com.example.unimarket.models.Seller

class SellerAdapter(
    private val sellers: List<Seller>
) : RecyclerView.Adapter<SellerAdapter.SellerViewHolder>() {

    class SellerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvSubtitle: TextView = itemView.findViewById(R.id.tvSubtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SellerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_seller, parent, false)
        return SellerViewHolder(view)
    }

    override fun onBindViewHolder(holder: SellerViewHolder, position: Int) {
        val seller = sellers[position]
        holder.tvTitle.text = seller.name
        holder.tvSubtitle.text = if (seller.verified) "Verified Seller" else "Pending Verification"
    }

    override fun getItemCount(): Int = sellers.size
}