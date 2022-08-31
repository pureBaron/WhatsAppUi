package com.example.whatsappui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(val contactsList : List<Contacts>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {


    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val profile : ImageView = view.findViewById(R.id.contactProfile)
        val name : TextView = view.findViewById(R.id.contactName)
        val content : TextView = view.findViewById(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item , parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = contactsList[position]
        holder.profile.setImageResource(list.profileId)
        holder.name.text = list.namee
        holder.content.text = list.content
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}