package cl.mesacritica.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/** Prototipo visual de ES1. La persistencia y validación corresponden a unidades posteriores. */
class IAActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ia)
        findViewById<View>(R.id.btnVolverLista).setOnClickListener { startActivity(Intent(this, ListaActivity::class.java)) }
        findViewById<View>(R.id.btnPreguntar).setOnClickListener { findViewById<android.widget.TextView>(R.id.txtRespuesta).setText(R.string.ia_respuesta) }
    }
}