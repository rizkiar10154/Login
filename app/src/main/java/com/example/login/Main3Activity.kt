package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import android.content.Intent
import android.view.View
import android.widget.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        buttona3.setOnClickListener{

            val intent = Intent(this@Main3Activity, Main4Activity::class.java)
            startActivity(intent)

        }


        val intent = intent
        val nama = intent.getStringExtra("Nama")
        val tvname = findViewById<TextView>(R.id.tvname)

        val nim = intent.getStringExtra("Nim")
        val tvnim = findViewById<TextView>(R.id.tvnim)

        val univ = intent.getStringExtra("Univ")
        val tvuniv = findViewById<TextView>(R.id.tvuniv)


        tvname.text = nama
        tvnim.text = nim
        tvuniv.text = univ


        //Spinner
        val jurusan = arrayListOf("TI", "SI", "MI", "TK", "KA")
        val Spinner = findViewById<Spinner>(R.id.sp3)
        if (Spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, jurusan)
            sp3.adapter = arrayAdapter

            sp3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        this@Main3Activity,
                        "Selected_item :" + " " + jurusan[position],
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Code to perform some action when nothing is selected

                }

                }
            }
        }
    }