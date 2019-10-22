package com.example.nestedscrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var Title : EditText
    private lateinit var Db : EditText
    private lateinit var Hp : EditText
    private lateinit var Cb : CheckBox
    private lateinit var Rb : RadioButton
    private lateinit var Country : Spinner
    private lateinit var Dr : TextView
    private lateinit var Submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Title = findViewById(R.id.id_title)
        Db = findViewById(R.id.id_db)
        Hp = findViewById(R.id.id_hp)
        Cb = findViewById(R.id.id_cb1)
        Cb = findViewById(R.id.id_cb2)
        Cb = findViewById(R.id.id_cb3)
        Cb = findViewById(R.id.id_cb4)
        Cb = findViewById(R.id.id_cb5)
        Cb = findViewById(R.id.id_cb6)
        Rb = findViewById(R.id.id_rb1)
        Rb = findViewById(R.id.id_rb2)
        Rb = findViewById(R.id.id_rb3)
        Country = findViewById(R.id.spinner)
        Dr = findViewById(R.id.id_dr)
        Submit = findViewById(R.id.id_button)

        Submit.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("Title", Title.text.toString())
            bundle.putString("Directed by", Db.text.toString())
            bundle.putString("Home Production", Hp.text.toString())
            bundle.putString("Genre", Cb.text.toString())
            bundle.putString("Age", Rb.text.toString())
            bundle.putString("Country", Country.toString())
            bundle.putString("Date", Dr.text.toString())
            val intent = Intent(this, ActivityKedua::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
