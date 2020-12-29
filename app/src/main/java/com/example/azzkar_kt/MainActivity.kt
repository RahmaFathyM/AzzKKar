package com.example.azzkar_kt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var context : Context =this
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_alsbah.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
               var intent = Intent(context , AzzkarAlsbah_rec::class.java)
                startActivity(intent)
            }
        })
        btn_almasaa.setOnClickListener{
            var intent =Intent(context,Azkaralmasaa_rec::class.java)
            startActivity(intent)
        }
    }
}
