package com.example.recyclerviewcontact.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcontact.R


/** It is container of that Item Layout, that will be reuse
 * as many items the RV is going to display
 * */

class ContactViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView) {

        val firstName : TextView = itemView.findViewById(R.id.tv_first_name)
        val lastName : TextView = itemView.findViewById(R.id.tv_last_name)
        val email : TextView = itemView.findViewById(R.id.tv_email)

}