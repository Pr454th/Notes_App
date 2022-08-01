package com.prasath.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton

class formActivity : AppCompatActivity() {
    lateinit var nTitle:EditText
    lateinit var nNote:EditText
    lateinit var btn:FloatingActionButton
    private lateinit var viewModel:MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        nTitle=findViewById(R.id.titleField)
        nNote=findViewById(R.id.noteField)
        btn=findViewById(R.id.createNote)
        btn.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            item.add(Note(nTitle.text.toString(),nNote.text.toString()))
            startActivity(intent)
        }

    }
}