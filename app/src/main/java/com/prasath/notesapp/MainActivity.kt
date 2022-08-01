package com.prasath.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.math.log

var item=ArrayList<Note>()
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycler_view)
        recyclerView.layoutManager=LinearLayoutManager(applicationContext)
        val adapter=NoteAdapter(item,this)
        recyclerView.adapter=adapter

        var addNote:FloatingActionButton=findViewById(R.id.addNote)
        addNote.setOnClickListener {
            val intent= Intent(this,formActivity::class.java)
            startActivity(intent)
        }

    }
}