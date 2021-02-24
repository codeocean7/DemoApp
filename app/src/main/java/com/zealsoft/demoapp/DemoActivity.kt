package com.zealsoft.demoapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DemoActivity :AppCompatActivity()
{
    //val  var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.demo_activity)

        val edtMessage=findViewById<EditText>(R.id.edtMessage)
        val btnOk=findViewById<Button>(R.id.btnOk)
        val txtMessage=findViewById<TextView>(R.id.txtMessage)

        btnOk.setOnClickListener {
            txtMessage.text=edtMessage.text.toString()
        }

    }


}