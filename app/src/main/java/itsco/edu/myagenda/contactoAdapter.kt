package itsco.edu.myagenda

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactoAdapter (private val ListContactos: ArrayList<Contacto>):
        RecyclerView.Adapter<contactoAdapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var lbNombre: TextView? = null
        var lbTelefono: TextView? = null
        init {
            lbNombre = view.findViewById(R.id.lb_nombre)
            lbTelefono = view.findViewById(R.id.lb_telefono)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).
                         inflate(R.layout.contacto_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListContactos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.lbNombre?.text = ListContactos[position].nombre
        holder.lbTelefono?.text = ListContactos[position].telefono
    }
}