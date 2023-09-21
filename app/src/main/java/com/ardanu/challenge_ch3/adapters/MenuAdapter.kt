package com.ardanu.challenge_ch3.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ardanu.challenge_ch3.R
import com.ardanudn.challenge_ch2.MenuMakanan


class MenuAdapter(private val menuList: List<MenuMakanan>, private val isGrid: Boolean) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // Create a new view, which defines the UI of the list item
        if (isGrid) {
            val view =
                LayoutInflater.from(viewGroup.context)
                    .inflate(R.layout.menu_item, viewGroup, false)
            return GridViewHolder(view)
        } else {
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.list_menu_item, viewGroup, false)
            return ListViewHolder(view)
        }
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        if (isGrid){
            val gridVH = viewHolder as GridViewHolder
            val item = menuList[position]
            gridVH.imgBurger.setImageResource(item.imageResId)
            gridVH.burger.text = item.nama
            gridVH.hargaBurger.text = item.harga
            gridVH.itemView.setOnClickListener(View.OnClickListener {
                val bundle = bundleOf("DATA_MENU" to item)
                it.findNavController().navigate(R.id.action_homeFragment_to_detailMenuFragment,bundle)
            })
        }else{
            val listVH = viewHolder as ListViewHolder
            val item = menuList[position]
            listVH.imgBurger.setImageResource(item.imageResId)
            listVH.burger.text = item.nama
            listVH.hargaBurger.text = item.harga
        }

    }

    override fun getItemCount() = menuList.size

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgBurger: ImageView = itemView.findViewById(R.id.img_burger)
        val burger: TextView = itemView.findViewById(R.id.burger)
        val hargaBurger: TextView = itemView.findViewById(R.id.harga_burger)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBurger: ImageView = itemView.findViewById(R.id.img_burger_list)
        val burger: TextView = itemView.findViewById(R.id.burger_list)
        val hargaBurger: TextView = itemView.findViewById(R.id.harga_burger_list)

    }

}