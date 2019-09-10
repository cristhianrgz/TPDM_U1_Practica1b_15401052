package mx.edu.tpdm_u1_practica1b_15401052

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    var ferianavidad : ImageButton ?= null
    var jalisco : ImageButton ?= null
    var zoo : ImageButton ?= null
    var bodascar : ImageButton ?= null
    var cumplecristo : ImageButton ?=null
    var laguna : ImageButton ?= null
    var dianuevo : ImageButton ?= null
    var mazamitla : ImageButton ?= null
    var bautizo : ImageButton ?= null
    var campamento : ImageButton ?= null
    var futbol : ImageButton ?= null
    var posada : ImageButton ?= null
    var cumpleabue : ImageButton ?= null
    var primos : ImageButton ?= null
    var fiesta : ImageButton ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ferianavidad = findViewById( R.id.imagen1)
        jalisco = findViewById( R.id.imagen2)
        zoo = findViewById( R.id.imagen3)
        bodascar = findViewById( R.id.imagen4)
        cumplecristo = findViewById( R.id.imagen5)
        laguna = findViewById( R.id.imagen6)
        dianuevo = findViewById( R.id.imagen7)
        mazamitla = findViewById( R.id.imagen8)
        bautizo = findViewById( R.id.imagen9)
        campamento = findViewById( R.id.imagen10)
        futbol = findViewById( R.id.imagen11)
        posada = findViewById( R.id.imagen12)
        cumpleabue = findViewById( R.id.imagen13)
        primos = findViewById( R.id.imagen14)
        fiesta = findViewById( R.id.imagen15)

        //--------------------------------------------
        ferianavidad?.setOnClickListener {
            var feriaActivity = Intent(this, Main2Activity::class.java)
            startActivity(feriaActivity)
        }

        jalisco?.setOnClickListener {
            var jaliscoActivity = Intent(this, Main3Activity::class.java)
            startActivity(jaliscoActivity)
        }

        zoo?.setOnClickListener {
            var zooActivity = Intent(this, Main4Activity::class.java)
            startActivity(zooActivity)
        }

        bodascar?.setOnClickListener {
            var bodaActivity = Intent(this, Main5Activity::class.java)
            startActivity(bodaActivity)
        }

        cumplecristo?.setOnClickListener {
            var cumplecristoActivity = Intent(this, Main6Activity::class.java)
            startActivity(cumplecristoActivity)
        }

        laguna?.setOnClickListener {
            var lagunaActivity = Intent(this, Main7Activity::class.java)
            startActivity(lagunaActivity)
        }

        dianuevo?.setOnClickListener {
            var dianuevoActivity = Intent(this, Main8Activity::class.java)
            startActivity(dianuevoActivity)
        }

        mazamitla?.setOnClickListener {
            var mazamitlaActivity = Intent(this, Main9Activity::class.java)
            startActivity(mazamitlaActivity)
        }

        bautizo?.setOnClickListener {
            var bautizoActivity = Intent(this, Main10Activity::class.java)
            startActivity(bautizoActivity)
        }

        campamento?.setOnClickListener {
            var campamentoActivity = Intent(this, Main11Activity::class.java)
            startActivity(campamentoActivity)
        }

        futbol?.setOnClickListener {
            var futbolActivity = Intent(this, Main12Activity::class.java)
            startActivity(futbolActivity)
        }

        posada?.setOnClickListener {
            var posadaActivity = Intent(this, Main13Activity::class.java)
            startActivity(posadaActivity)
        }

        cumpleabue?.setOnClickListener {
            var cumpleabueActivity = Intent(this, Main14Activity::class.java)
            startActivity(cumpleabueActivity)
        }

        primos?.setOnClickListener {
            var primosActivity = Intent(this, Main15Activity::class.java)
            startActivity(primosActivity)
        }

        fiesta?.setOnClickListener {
            var fiestaActivity = Intent(this, Main16Activity::class.java)
            startActivity(fiestaActivity)
        }
    }
}
