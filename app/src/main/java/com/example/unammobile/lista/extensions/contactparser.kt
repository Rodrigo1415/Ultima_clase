package com.example.unammobile.lista.extensions

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.unammobile.lista.model.Contacto

fun getContactFromArray (name: ArrayList<String>, number: ArrayList<String>, email: ArrayList<String>): ArrayList<Contacto> {

    val contactList: ArrayList<Contacto> = ArrayList<Contacto>(0)
    var i = 0
    name.forEach {
        contactList.add(Contacto(name[i],number[i],email[i]))
        i += 1
    }
    return contactList
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View
        = LayoutInflater.from(context).inflate(layoutRes,this,attachToRoot)