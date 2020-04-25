package br.elas.no.kotlinapp.view

import br.elas.no.kotlinapp.view.adapter.EtAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.elas.no.kotlinapp.R
import kotlinx.android.synthetic.main.activity_home.*
import model.EtModel

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapter = EtAdapter(getEtModel())
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)

    }

    private fun getEtModel(): MutableList<EtModel> {
        val lista = mutableListOf<EtModel>()

        lista.add(EtModel("JULIE", 0))
        lista.add(EtModel("CLEBER", 2))
        lista.add(EtModel("CLEBER", 2))
        lista.add(EtModel("CLEBER", 2))
        lista.add(EtModel("CLEBER", 2))
        lista.add(EtModel("CLEBER", 2))

        return lista
    }
}
