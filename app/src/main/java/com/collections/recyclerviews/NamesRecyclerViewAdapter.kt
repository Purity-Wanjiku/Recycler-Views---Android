package com.collections.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NamesRecyclerViewAdapter (var namesList: List<String>): RecyclerView.Adapter<NamesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent, false)
        return NamesViewHolder(itemView)

//        creates the different views that gets recycled by the recycler view
//        facilitates the smooth and fast loading of the recyclerview object
    }                             

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val currentName = namesList.get(position)
        holder.tvName.text = currentName
    }

    override fun getItemCount(): Int {
        return namesList.size
//        tells recyclerview to stop displaying the names after it has reached te end of the size of the list
    }
}
class NamesViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    recyclerview doesn't know how to access the text view, it uses the viewHolder
}