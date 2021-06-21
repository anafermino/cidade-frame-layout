package com.example.framecidade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCidade.setOnClickListener {

            val intent = (Intent(this,CidadeActivity::class.java))

            // Definindo o Extra
            intent.putExtra("TEXTO", "Sorocaba")

            startActivity(intent)
                    }

    }
}