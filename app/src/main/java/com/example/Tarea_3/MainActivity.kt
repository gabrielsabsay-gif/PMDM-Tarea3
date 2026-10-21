package com.example.Tarea_3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declarar y acceder a los componentes con findViewById
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        // Manejo de eventos: utilizar setOnClickListener en el botón
        btnSaludar.setOnClickListener {
            // Obtener el texto escrito en el EditText
            val nombre = etNombre.text.toString()

            // Verificar que no esté vacío y mostrar el saludo en un Toast
            if (nombre.isNotEmpty()) {
                Toast.makeText(this, "Hola $nombre", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Por favor, introduce tu nombre", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
