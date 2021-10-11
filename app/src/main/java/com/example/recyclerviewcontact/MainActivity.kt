package com.example.recyclerviewcontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcontact.model.Contact
import com.example.recyclerviewcontact.view.ContactAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //private lateinit var list: ArrayList<Contact>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val itemAdapter = ContactAdapter(getContacts())

        recyclerView.adapter = itemAdapter
    }

    private fun getContacts() : ArrayList<Contact>{

        val list: ArrayList<Contact> = arrayListOf<Contact>(
            Contact("Jhon", "Smith", "email"),
            Contact("aaa", "aaa", "email"),
            Contact("aaa", "aaa", "email"),
            Contact("aaa", "aaa", "email"),
            Contact("aaa", "aaa", "email"),
            Contact("aaa", "aaa", "email"),
            Contact("aaa", "aaa", "email"),
        )

        return list
    }
}


/*      1. Create Item Layout(xml file)
 *      2. Create the RecyclerView.ViewHolder
 *      3. Create RecyclerView.Adapter
 *      4. Init the Recycler and configure
 *              LayoutManager
 *              Rv.Adapter
 *
 *   */