package br.elas.no.kotlinapp.view.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.elas.no.kotlinapp.R
import kotlinx.android.synthetic.main.home_item_list.view.*
import model.EtModel

class EtAdapter(val listaEt: MutableList<EtModel>) : RecyclerView.Adapter<EtAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.home_item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listaEt.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listaEt[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(etModel: EtModel) {
            itemView.texto.text= etModel.nome

            val drawable = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                itemView.resources.getDrawable(R.drawable.et, null)
            } else {
                TODO("VERSION.SDK_INT < LOLLIPOP")
            }

            itemView.et_img.setImageDrawable(drawable)
        }
    }

}