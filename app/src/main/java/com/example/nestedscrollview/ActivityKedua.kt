package com.example.nestedscrollview

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException
import android.widget.*

class ActivityKedua : AppCompatActivity() {
    private lateinit var Title: EditText
    private lateinit var Db: EditText
    private lateinit var Hp: EditText
    private lateinit var Cb: CheckBox
    private lateinit var Rb: RadioButton
    private lateinit var Country: Spinner
    private lateinit var Dr: TextView
    private lateinit var Submit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitykedua)

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

        Submit.setOnClickListener{
            val intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("Title", Title.text.toString())
            intent.putExtra("Directed by", Db.text.toString())
            intent.putExtra("Home Production", Hp.text.toString())
            intent.putExtra("Genre", Cb.text.toString())
            intent.putExtra("Age", Rb.text.toString())
            intent.putExtra("Country", Country.toString())
            intent.putExtra("Date", Dr.text.toString())
            startActivity(intent)
        }
    }
}