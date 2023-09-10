package com.example.clv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListData= mutableListOf<MyData>()
        myListData.add(MyData(R.drawable.google,"Google","This is google"))
        myListData.add(MyData(R.drawable.facebook,"Facebook","This is facebook"))
        myListData.add(MyData(R.drawable.twitter,"Twitter","This is twitter"))

        val myListView=findViewById<ListView>(R.id.my_list_view)
        myListView.adapter=MyCustomAdapter(this,myListData)

    }
}