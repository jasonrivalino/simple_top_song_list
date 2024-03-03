package com.example.recyclerview

import android.content.Intent
import android.net.Uri
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

        // Initate data of title
        val title = ArrayList<String>()
        title.add("Thank U Next")
        title.add("Sweetener")
        title.add("You & Me")
        title.add("Happier")
        title.add("Happier")
        title.add("Get Him Back")
        title.add("Lose You To Love Me")
        title.add("Cruel Summer")

        // Initate data of singer
        val singer = ArrayList<String>()
        singer.add("Ariana Grande")
        singer.add("Ariana Grande")
        singer.add("Jennie Kim")
        singer.add("Marshmello")
        singer.add("Olivia Rodrigo")
        singer.add("Olivia Rodrigo")
        singer.add("Selena Gomez")
        singer.add("Taylor Swift")

        // Initate data of youtubeLink
        val youtubeLink = ArrayList<String>()
        youtubeLink.add("https://www.youtube.com/watch?v=gl1aHhXnN1k")
        youtubeLink.add("https://www.youtube.com/watch?v=6vay5SgNPpk")
        youtubeLink.add("https://www.youtube.com/watch?v=eQNHDV7lKgE")
        youtubeLink.add("https://www.youtube.com/watch?v=m7Bc3pLyij0")
        youtubeLink.add("https://www.youtube.com/watch?v=ZQFmRXgeR-s")
        youtubeLink.add("https://www.youtube.com/watch?v=ZsJ-BHohXRI")
        youtubeLink.add("https://www.youtube.com/watch?v=zlJDTxahav0")
        youtubeLink.add("https://www.youtube.com/watch?v=ic8j13piAhQ")

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        for (i in 0..7) {
            data.add(ItemsViewModel(image[i], title[i], singer[i], youtubeLink[i]))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
