package com.riet.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etage:EditText
    lateinit var etheight:EditText
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etname = findViewById(R.id.name)
        etage = findViewById(R.id.age)
        etheight = findViewById(R.id.height)
        btn = findViewById(R.id.btn)

            btn.setOnClickListener{
            etname.setText("")
            etage.setText("")
            etheight.setText("")
        }
        //set on click listener
        btn.setOnClickListener {
         if(etname.text.toString().isNullOrEmpty()){
             etname.error="enter your name"
         }
         else if (etage.toString().isNullOrEmpty()) {
             etage.error = "enter  your age"
         }
         else if (etheight.toString().isNullOrEmpty()){
             etheight.error="enter your height"
             }


         }
         var height=etheight.text
            Toast.makeText(this,"submitted",
                Toast.LENGTH_SHORT).show()
        }

    }




    }