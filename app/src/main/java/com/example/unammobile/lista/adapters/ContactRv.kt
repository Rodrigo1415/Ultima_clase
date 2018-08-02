package com.example.unammobile.lista.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.unammobile.lista.R
import com.example.unammobile.lista.extensions.inflate
import com.example.unammobile.lista.model.Contacto
import kotlinx.android.synthetic.main.recycler_list_1.view.*

class ContactRv (private val dataSource:ArrayList<Contacto>): RecyclerView.Adapter<ContactRv.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder = ContactViewHolder(parent.inflate(R.layout.recycler_list_1))

    override fun getItemCount(): Int = dataSource.size

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) = holder.bind(dataSource[position])

    class ContactViewHolder (contactItemView: View): RecyclerView.ViewHolder(contactItemView) {
        fun bind (Contacto: Contacto) = with(itemView){
            tvName.text = Contacto.name
            tvNumber.text = Contacto.number
            tvEmail.text = Contacto.email
        }
    }

}