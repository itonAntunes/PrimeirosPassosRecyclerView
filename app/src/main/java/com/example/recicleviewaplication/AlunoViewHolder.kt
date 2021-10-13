package com.example.recicleviewaplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlunoViewHolder(view: View):RecyclerView.ViewHolder(view) {

    var nomeAluno = view.findViewById<TextView>(R.id.item_text)

}