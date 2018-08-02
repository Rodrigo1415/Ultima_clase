package com.example.unammobile.lista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.unammobile.lista.adapters.ContactRv
import com.example.unammobile.lista.extensions.getContactFromArray
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setContacs(){
        val contactos = getContactFromArray(setNameList(), setNumberList(), setEmailList())
        rvContactos.layoutManager = LinearLayoutManager(this)
        rvContactos.adapter = ContactRv(contactos)
    }

    fun setNameList(): ArrayList<String> {
        val nameArrayList: ArrayList<String> = ArrayList(0)
        nameArrayList.apply {
            add("Rodrigo")
            add("Eduardo")
            add("Bely")
            add("Ulises")
            add("Fernando")
            add("Victor")
            add("Ivan")
            add("Karla")
            add("Diana")
            add("Andy")
            add("Lesly")
        }
        return nameArrayList
    }

    fun setNumberList(): ArrayList<String> {
        val numberArrayList: ArrayList<String> = ArrayList()
        numberArrayList.apply {
            add("58653359")
            add("25935621")
            add("21548725")
            add("21547896")
            add("45879635")
            add("45698653")
            add("45986315")
            add("75123486")
            add("48621597")
            add("12345678")
        }
        return numberArrayList
    }

    fun setEmailList(): ArrayList<String> {
        val emailArrayList: ArrayList<String> = ArrayList(0)
        emailArrayList.apply {
            add("Correo 1")
            add("Correo 2")
            add("Correo 3")
            add("Correo 4")
            add("Correo 4")
            add("Correo 5")
            add("Correo 5")
            add("Correo 6")
            add("Correo 7")
            add("Correo 8")
            add("Correo 9")
        }
        return  emailArrayList
    }
}




