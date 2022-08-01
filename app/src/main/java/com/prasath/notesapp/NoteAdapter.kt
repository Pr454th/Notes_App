package com.prasath.notesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.prasath.notesapp.NoteAdapter.*

class NoteAdapter(val list_of_notes: ArrayList<Note>, val context: Context): RecyclerView.Adapter<NoteAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view)
    {
        var Title:TextView
        var Note:TextView
        init{
            Title=view.findViewById<TextView>(R.id.Title)
            Note=view.findViewById<TextView>(R.id.Note)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.note_detail,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list_of_notes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Title.text=list_of_notes[position].Title
        holder.Note.text=list_of_notes[position].Note
    }
}