package com.example.minishop

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listViewProduits: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        listViewProduits = findViewById(R.id.listViewProduits)

        val produits = arrayOf(
            "Téléphone",
            "Ordinateur",
            "Écouteurs",
            "Montre",
            "Accessoires",
            "Cosmétiques"
        )

        val adapter = ArrayAdapter(
            this,
            R.layout.item_produit,
            R.id.nomProduit,
            produits
        )

        listViewProduits.adapter = adapter

        listViewProduits.setOnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                this,
                "Produit sélectionné : ${produits[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}