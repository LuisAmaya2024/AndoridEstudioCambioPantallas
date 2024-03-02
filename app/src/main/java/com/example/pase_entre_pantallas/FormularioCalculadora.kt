package com.example.pase_entre_pantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormularioCalculadora : AppCompatActivity() {
    lateinit var  campouno : EditText
    lateinit var campodos : EditText
    lateinit var Botonsumar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_calculadora)
        campouno = findViewById(R.id.editTextNumber)
        campodos= findViewById(R.id.editTextNumber2)
        Botonsumar=findViewById(R.id.btn_sumar)
    }
    fun sumarnumero(v:View){
        val primernumero= campouno.text.toString().toInt()
        val segundonumero= campodos.text.toString().toInt()
        val resultado = primernumero + segundonumero
        Toast.makeText(this, "El resultado es:"+resultado,Toast.LENGTH_SHORT).show()

    }
}