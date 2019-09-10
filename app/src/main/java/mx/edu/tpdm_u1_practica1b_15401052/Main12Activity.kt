package mx.edu.tpdm_u1_practica1b_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main12Activity : AppCompatActivity() {
    var botonReg : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        botonReg = findViewById( R.id.regresar)

        botonReg?.setOnClickListener {
            finish()
        }
    }
}
