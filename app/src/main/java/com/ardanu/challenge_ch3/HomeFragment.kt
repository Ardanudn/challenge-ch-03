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

    private var isGrid = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = findNavController()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_menu)
        val btnStyleMenu = view.findViewById<ImageButton>(R.id.btn_list)

        val menu = dataMenu()


        recyclerView.layoutManager = GridLayoutManager(activity,2)
        val menuAdapter = MenuAdapter(menu,isGrid)
        recyclerView.adapter = menuAdapter

        btnStyleMenu.setOnClickListener {
            if (isGrid) {
                btnStyleMenu.setImageResource(R.drawable.ic_list)
                recyclerView.layoutManager = LinearLayoutManager(activity)
                isGrid = false
                // Inisialisasi adapter
                val menuAdapter = MenuAdapter(menu, isGrid)
                recyclerView.adapter = menuAdapter
            } else {
                btnStyleMenu.setImageResource(R.drawable.ic_grid)
                recyclerView.layoutManager = GridLayoutManager(activity, 2)
                isGrid = true
                // Inisialisasi adapter
                val menuAdapter = MenuAdapter(menu, isGrid)
                recyclerView.adapter = menuAdapter
            }
        }
    }


    private fun dataMenu():List<MenuMakanan> {
        // Inisialisasi data menu makanan
        val menuMakanan = mutableListOf<MenuMakanan>()
        menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger", 28000,"Menu cepat saji yang memiliki isian yang banyak dan mengenyangkan","Jl. Mayor Oking Citeureup Gg. Prihatin No.RT03/03, Gn. Putri, Kec. Gn. Putri, Kabupaten Bogor, Jawa Barat 16961","https://maps.app.goo.gl/8zLZfQP5pGMm2tEJ7"))
        menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng", 20000,"Hidangan dari ayam dengan bumbu rempah-rempah yang khas dan digoreng hingga menjadi renyah","Jl. Karang Kobar No.5, Karangkobar, Sokanegara, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53115","https://maps.app.goo.gl/irNJZekVWDK2hNnw9"))
        menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang", 25000,"Hidangan dari ayam dengan lalu dipanggang atau dibakar hingga matang dan berwarna kecokelatan","Jl. Jend. Gatot Subroto No. 68D, Purwanegara, Purwokerto Utara, Brubahan, Purwanegara, Banyumas, Kabupaten Banyumas, Jawa Tengah 53116","https://maps.app.goo.gl/NTaLvgrN6hypf3Zg6"))
        menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        for(i in 1..4){
            menuMakanan.add(MenuMakanan(R.drawable.burger, "Burger $i", 28000,"Menu cepat saji yang memiliki isian yang banyak dan mengenyangkan","Jl. Mayor Oking Citeureup Gg. Prihatin No.RT03/03, Gn. Putri, Kec. Gn. Putri, Kabupaten Bogor, Jawa Barat 16961","https://maps.app.goo.gl/8zLZfQP5pGMm2tEJ7"))
            menuMakanan.add(MenuMakanan(R.drawable.ayamgoreng, "Ayam Goreng $i", 20000,"Hidangan dari ayam dengan bumbu rempah-rempah yang khas dan digoreng hingga menjadi renyah","Jl. Karang Kobar No.5, Karangkobar, Sokanegara, Kec. Purwokerto Tim., Kabupaten Banyumas, Jawa Tengah 53115","https://maps.app.goo.gl/irNJZekVWDK2hNnw9"))
            menuMakanan.add(MenuMakanan(R.drawable.ayampanggang, "Ayam Panggang $i", 25000,"Hidangan dari ayam dengan lalu dipanggang atau dibakar hingga matang dan berwarna kecokelatan","Jl. Jend. Gatot Subroto No. 68D, Purwanegara, Purwokerto Utara, Brubahan, Purwanegara, Banyumas, Kabupaten Banyumas, Jawa Tengah 53116","https://maps.app.goo.gl/NTaLvgrN6hypf3Zg6"))
            menuMakanan.add(MenuMakanan(R.drawable.dimsum, "Dim Sum $i", 27000,"Variasi dari pangsit tradisional China yang disajikan dengan cara dikukus dan digoreng","Jl.BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345","https://maps.app.goo.gl/h4wQKqaBuXzftGK77"))
        }
        return  menuMakanan
    }
}