package ru.gb.moneyexchange.presentation.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.gb.moneyexchange.R
import ru.gb.moneyexchange.data.retrofit.model.MoneyItem
import ru.gb.moneyexchange.domain.model.ExchangeData

class MainAdapter: RecyclerView.Adapter<MainAdapter.RecyclerItemViewHolder>() {

    private var data: List<MoneyItem> = listOf()

    fun setData(data: List<MoneyItem>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerItemViewHolder {
       return RecyclerItemViewHolder(
           LayoutInflater.from(parent.context)
               .inflate(R.layout.fragment_main_list_item, parent, false) as View
       )
    }

    override fun onBindViewHolder(holder: RecyclerItemViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class RecyclerItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(data: MoneyItem){
            if (layoutPosition != RecyclerView.NO_POSITION){
                itemView.findViewById<TextView>(R.id.charcode).text = data.CharCode
                itemView.findViewById<TextView>(R.id.name).text = data.Name
                itemView.findViewById<TextView>(R.id.value).text = data.Value.toString()
                itemView.findViewById<TextView>(R.id.nominal).text = data.Nominal.toString()
            }
        }
    }
}