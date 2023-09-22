package com.ardanu.challenge_ch3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ardanu.challenge_ch3.databinding.FragmentDetailMenuBinding

class DetailMenuFragment : Fragment() {

    private lateinit var binding: FragmentDetailMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailMenuBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemMenu = arguments?.getParcelable<MenuMakanan>("DATA_MENU")!!

        binding.ivGambarMenu.setImageResource(itemMenu.imageResId)
        binding.txtNamaMakanan.text = itemMenu.nama
        binding.txtHarga.text = "Rp. ${itemMenu.harga}"
        binding.txtDeskripsiMenu.text = itemMenu.deksripsi
        binding.txtDeskripsiLokasi.text = itemMenu.lokasi

        binding.txtDeskripsiLokasi.setOnClickListener(View.OnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(itemMenu.urlLokasi))
            startActivity(mapIntent);
        })

    }

}