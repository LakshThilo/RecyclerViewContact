package com.example.recyclerviewcontact.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcontact.R
import com.example.recyclerviewcontact.databinding.ContactItemLayoutBinding
import com.example.recyclerviewcontact.model.Contact


/**
 *  Adapt the VH implementation to control the element from the Data Set
 * */
class ContactAdapter(private val dataSet: ArrayList<Contact>): RecyclerView.Adapter<ContactViewHolder>() {


    /**
     *  Create the ViewHolder define in the diamond operator
     * */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
      return ContactViewHolder(
          LayoutInflater.from(parent.context)
              .inflate(R.layout.contact_item_layout,
              parent,
              false)
      )
    }


    /**
     *  Connect the data set item with the viewHolder blueprint @param position the current
     *  index row element to be display
     * */
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val element = dataSet[position] // dataSet.get(position)

        holder.firstName.text = element.fName
        holder.lastName.text = element.lName
        holder.email.text = element.email
    }



    /** return entire data set size*/
    override fun getItemCount(): Int = dataSet.size
}