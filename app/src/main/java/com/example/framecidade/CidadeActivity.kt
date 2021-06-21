package com.example.framecidade

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cidade.*

class CidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cidade)

        if(intent.extras != null) {
            val nomeCidade = intent.getStringExtra("TEXTO")
            txtCidade.text = nomeCidade
        }

        btnEstado.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(this, "Voltando pro Estado", Toast.LENGTH_SHORT).show()
        }

        }
}


