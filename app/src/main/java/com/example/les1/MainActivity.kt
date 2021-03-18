package com.example.les1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun addTo(): Boolean{
        return true
    }

    val list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edTxt= findViewById<EditText>(R.id.editTextTextPersonName)
        val butAdd = findViewById<Button>(R.id.button4)
        butAdd.setOnClickListener {
           list += edTxt.text.toString()
            edTxt.setText("")
        }

        val txtView = findViewById<TextView>(R.id.textView)

        val butShow= findViewById<Button>(R.id.button5)
        butShow.setOnClickListener {
            list.sort()
            txtView.text = list.joinToString(separator = "\n")
            list.clear()

        }
    }
}