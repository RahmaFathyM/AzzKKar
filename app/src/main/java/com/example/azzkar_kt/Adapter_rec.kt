package com.example.azzkar_kt

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_rec (private  var list: List<String>) :
    RecyclerView.Adapter<Adapter_rec.ViewHolder>() {
    var con: Adapter_rec =this
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
       val zekr:TextView=itemView.findViewById(R.id.zekr)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =LayoutInflater.from(parent.context).inflate(R.layout.activity_adapter_rec__azzkar,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.zekr.text= list[position]

    }
}