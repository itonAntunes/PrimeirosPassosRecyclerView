package com.example.recicleviewaplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterAlunos(val mainActivity: Context,
                    val alunos: List<String>)
    : RecyclerView.Adapter<AlunoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(mainActivity)
            .inflate(R.layout.item_list_layout,parent,false)

        return AlunoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val nomeAluno: String = alunos[position]
        holder.nomeAluno.text = nomeAluno
    }

    override fun getItemCount(): Int {
        return alunos.size

    }



}