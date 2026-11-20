package cl.mesacritica.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/** Prototipo visual de ES1. La persistencia y validación corresponden a unidades posteriores. */
class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        findViewById<View>(R.id.btnCrearCuenta).setOnClickListener { startActivity(Intent(this, ListaActivity::class.java)) }
        findViewById<View>(R.id.btnVolver).setOnClickListener { startActivity(Intent(this, LoginActivity::class.java)) }
    }
}