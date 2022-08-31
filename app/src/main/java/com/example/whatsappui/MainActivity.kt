package com.example.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_item.*

class MainActivity : AppCompatActivity() , PopupMenu.OnMenuItemClickListener{

    private val contactList = ArrayList<Contacts>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        initList()

        val layoutManager = LinearLayoutManager(this)
        contactsRecyclerView.layoutManager = layoutManager

        val adapter = ContactsAdapter(contactList)
        contactsRecyclerView.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val pop = PopupMenu(this, menuBtn)
        pop.menuInflater.inflate(R.menu.menu, pop.menu)
        pop.setOnMenuItemClickListener(this)
        menuBtn.setOnClickListener{
            pop.show()
        }
        return true
    }




    private fun initList(){
        repeat(2){
            contactList.apply {
                add(Contacts(R.drawable.apple_pic , "Reihoon" , "هوی نازی!!"))
                add(Contacts(R.drawable.cherry_pic , "Baron" , "نازگل خله:(!!"))
                add(Contacts(R.drawable.grape_pic , "Ali" , "هی روزگار نامناسب!!"))
                add(Contacts(R.drawable.watermelon_pic , "Baba" , "برام نت بخر!!"))
                add(Contacts(R.drawable.orange_pic , "Maman" , "ناهار پختی؟!!"))
                add(Contacts(R.drawable.banana_pic , "Matin" , "دختر زشت!!"))

            }
        }
    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {

        return false
    }
}