package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etname = findViewById<EditText>(R.id.etname)

        buttona1.setOnClickListener{
            val name = etname.text.toString()

            //intent to start activity
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            intent.putExtra("Name", name)


            startActivity(intent)

        }
    }
}
