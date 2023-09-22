package com.ardanu.challenge_ch3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


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
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger", 28000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng", 20000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang", 25000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger1", 28000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng1", 20000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang1", 25000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum1", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger2", 28000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng2", 20000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang2", 25000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum2", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger3", 28000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng3", 20000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang3", 25000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum3", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))


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