package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // Initate data of image
        val image = ArrayList<Int>()
        image.add(R.drawable.ariana1)
        image.add(R.drawable.ariana2)
        image.add(R.drawable.jennie)
        image.add(R.drawable.marshmello)
        image.add(R.drawable.olivia1)
        image.add(R.drawable.olivia2)
        image.add(R.drawable.selena)
        image.add(R.drawable.taylor)

        val title = ArrayList<String>()
        title.add("Thank U Next")
        title.add("Sweetener")
        title.add("You & Me")
        title.add("Happier")
        title.add("Happier")
        title.add("Get Him Back")
        title.add("Lose You To Love Me")
        title.add("Cruel Summer")

        val singer = ArrayList<String>()
        singer.add("Ariana Grande")
        singer.add("Ariana Grande")
        singer.add("Jennie Kim")
        singer.add("Marshmello")
        singer.add("Olivia Rodrigo")
        singer.add("Olivia Rodrigo")
        singer.add("Selena Gomez")
        singer.add("Taylor Swift")

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        for (i in 1..7) {
            data.add(ItemsViewModel(image[i], title[i], singer[i]))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}
