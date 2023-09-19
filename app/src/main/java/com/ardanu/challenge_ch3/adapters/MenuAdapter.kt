package com.ardanudn.challenge_ch2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ardanu.challenge_ch3.R

class MenuAdapter(private val menuList: List<MenuMakanan>) :
    RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder)
         */
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val imgBurger: ImageView = itemView.findViewById(R.id.img_burger)
            val burger: TextView = itemView.findViewById(R.id.burger)
            val hargaBurger: TextView = itemView.findViewById(R.id.harga_burger)

//            init {
//                // Define click listener for the ViewHolder's View
//                textView = view.findViewById(R.id.textView)
//            }
        }

        // Create new views (invoked by the layout manager)
        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
            // Create a new view, which defines the UI of the list item
            val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.menu_item, viewGroup, false)
            return ViewHolder(view)
        }

        // Replace the contents of a view (invoked by the layout manager)
        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

            // Get element from your dataset at this position and replace the
            // contents of the view with that element
            val minuman = menuList[position]
            viewHolder.imgBurger.setImageResource(minuman.imageResId)
            viewHolder.burger.text = minuman.nama
            viewHolder.hargaBurger.text = minuman.harga
        }

        // Return the size of your dataset (invoked by the layout manager)
        override fun getItemCount() = menuList.size



}