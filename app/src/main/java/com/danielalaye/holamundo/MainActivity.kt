package com.danielalaye.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.danielalaye.holamundo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnChangeActivity.setOnClickListener{(validarNombre())}

    }

    fun validarNombre(){

        if (binding.etName.text.toString().isEmpty()){
            Toast.makeText(this, "El nombre está vacío", Toast.LENGTH_SHORT).show()
        }


    }
}