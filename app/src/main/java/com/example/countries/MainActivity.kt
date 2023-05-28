package com.example.countries


import android.os.Bundle

import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myListData: Array<MyList> = arrayOf(
            MyList("India",R.drawable.img_5 ),
            MyList("shri lanka", R.drawable.img_3),
            MyList("united kingdom",R.drawable.img_10),
            MyList("Bangladesh", R.drawable.img_10),
            MyList("germany", R.drawable.img_9),
            MyList("Indonesia", R.drawable.img_1),
            MyList("Australia", R.drawable.img_4),
            MyList("united states", R.drawable.img_6),
            MyList("Greece", R.drawable.img_5),
            MyList("Egypt", R.drawable.img_5),
            MyList("France", R.drawable.img_3)
        )
        var recyclerView: RecyclerView = findViewById(R.id.myRecyclerView)
        var adapter: RecyclerViewAdapter = RecyclerViewAdapter(myListData)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = adapter
    }
}

