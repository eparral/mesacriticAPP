package cl.mesacritica.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/** Prototipo visual de ES1. La persistencia y validación corresponden a unidades posteriores. */
class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        findViewById<View>(R.id.btnAgregar).setOnClickListener { startActivity(Intent(this, AgregarActivity::class.java)) }
        findViewById<View>(R.id.btnAbrirIA).setOnClickListener { startActivity(Intent(this, IAActivity::class.java)) }
        findViewById<View>(R.id.btnVerDetalle).setOnClickListener { startActivity(Intent(this, DetalleActivity::class.java)) }
        findViewById<View>(R.id.btnSalir).setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }
}