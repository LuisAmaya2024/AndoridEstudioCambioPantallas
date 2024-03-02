package com.example.pase_entre_pantallas


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  camponombre: EditText
    lateinit var botonmostrarmensaje: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        camponombre = findViewById(R.id.ingresa_datos)
        botonmostrarmensaje = findViewById(R.id.btn_mostrarmensaje)


    }
   fun mostrarmensaje (v: View){
       val mensaje = camponombre.text.toString().trim()
       if(mensaje.isNotEmpty()){
           Toast.makeText(this  ,mensaje,Toast.LENGTH_SHORT).show()
       } else{
           Toast.makeText(this, "El Campo esta vacio",Toast.LENGTH_SHORT).show()
       }


   }
    fun paseentrepantallas (v: View){

        var intent = Intent(this, FormularioCalculadora::class.java)
        startActivity(intent)


    }

}