package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main2.*
import android.widget.Spinner
import android.widget.ArrayAdapter

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttona2.setOnClickListener{

            val nama = etnama.text.toString()
            val nim = etnim.text.toString()
            val univ = etuniv.text.toString()
            val intent = Intent(this@Main2Activity, Main3Activity::class.java)

            intent.putExtra("Nama", nama)
            intent.putExtra("Nim", nim)
            intent.putExtra("Univ", univ)
            startActivity(intent)

        }

        val etnama = findViewById<EditText>(R.id.etnama)
        val etnim = findViewById<EditText>(R.id.etnim)
        val etuniv = findViewById<EditText>(R.id.etuniv)
        val sp2 = findViewById<Spinner>(R.id.sp2)

        val intent = this.intent
        val name = intent.getStringExtra("Name")


        abtv.text = name

        //Spinner
        val jurusan = arrayListOf("TI", "SI", "MI", "TK", "KA")
        val Spinner = findViewById<Spinner>(R.id.sp2)
        if (Spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, jurusan)
            sp2.adapter = arrayAdapter

            sp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>, view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@Main2Activity,
                        "Selected_item :" + " " + jurusan[position],
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Code to perform some action when nothing is selected }
                }


                }
            }
        }
    }


