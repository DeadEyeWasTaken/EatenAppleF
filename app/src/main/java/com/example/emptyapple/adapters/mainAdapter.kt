package com.example.emptyapple.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.emptyapple.databinding.ItemNoteBinding

class mainAdapter: Adapter<mainAdapter.MainViewHolder>() {
    private var myNotes: List<String> = listOf()

    fun setData(newData: List<String>) {
        myNotes = newData
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemNoteBinding.inflate(LayoutInflater.from(parent.context))
//            .inflate(R.layout.item_note, parent, false)
        return MainViewHolder(binding)
    }

    override fun getItemCount(): Int = myNotes.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
       holder.bind(myNotes[position])
    }

    class MainViewHolder(
        private val binding: ItemNoteBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dataItem: String) {
            binding.textItemName.text = dataItem
            binding.textItemDesc.text = dataItem

        }
    }


}