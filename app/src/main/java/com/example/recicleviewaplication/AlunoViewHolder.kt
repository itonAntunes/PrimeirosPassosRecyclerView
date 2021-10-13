package com.example.recicleviewaplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class AlunoViewHolder(view: View):RecyclerView.ViewHolder(view) {

    var nomeAluno = view.findViewById<TextView>()

}