package cl.mesacritica.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/** Prototipo visual de ES1. La persistencia y validación corresponden a unidades posteriores. */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<View>(R.id.btnIngresar).setOnClickListener { startActivity(Intent(this, ListaActivity::class.java)) }
        findViewById<View>(R.id.btnIrRegistro).setOnClickListener { startActivity(Intent(this, RegistroActivity::class.java)) }
    }
}