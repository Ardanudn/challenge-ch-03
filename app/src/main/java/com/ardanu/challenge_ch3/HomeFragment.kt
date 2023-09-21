package com.ardanu.challenge_ch3

import com.ardanu.challenge_ch3.adapters.MenuAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ardanudn.challenge_ch2.MenuMakanan


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var isGrid = true

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_menu)
        val btnStyleMenu = view.findViewById<ImageButton>(R.id.btn_list)

        // Inisialisasi data menu makanan
        val menuMakanan = mutableListOf<MenuMakanan>()
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger", "Rp. 28.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng", "Rp. 20.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang", "Rp. 25.000"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum", "Rp. 27.000"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger1", "Rp. 28.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng1", "Rp. 20.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang1", "Rp. 25.000"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum1", "Rp. 27.000"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger2", "Rp. 28.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng2", "Rp. 20.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang2", "Rp. 25.000"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum2", "Rp. 27.000"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger3", "Rp. 28.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng3", "Rp. 20.000"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang3", "Rp. 25.000"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum3", "Rp. 27.000"))


        val navController = findNavController()
        recyclerView.layoutManager = GridLayoutManager(activity,2)
        val menuAdapter = MenuAdapter(menuMakanan,isGrid)
        recyclerView.adapter = menuAdapter

        btnStyleMenu.setOnClickListener {
            if (isGrid) {
                btnStyleMenu.setImageResource(R.drawable.ic_list)
                recyclerView.layoutManager = LinearLayoutManager(activity)
                isGrid = false
                // Inisialisasi adapter
                val menuAdapter = MenuAdapter(menuMakanan, isGrid)
                recyclerView.adapter = menuAdapter
            } else {
                btnStyleMenu.setImageResource(R.drawable.ic_grid)
                recyclerView.layoutManager = GridLayoutManager(activity, 2)
                isGrid = true
                // Inisialisasi adapter
                val menuAdapter = MenuAdapter(menuMakanan, isGrid)
                recyclerView.adapter = menuAdapter
            }
        }
    }
}