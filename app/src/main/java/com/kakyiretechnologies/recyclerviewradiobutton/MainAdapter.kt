package com.kakyiretechnologies.recyclerviewradiobutton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kakyiretechnologies.recyclerviewradiobutton.databinding.CityListItemsBinding

/**
 * @author Kakyire
 * Created by Daniel Frimpong on April 25, 2022.
 * https://github.com/kakyire
 */
class MainAdapter :
    ListAdapter<City, MainAdapter.MainViewHolder>(DIFF_UTIL) {

    private var selectedPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.city_list_items, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(getItem(position))

    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = CityListItemsBinding.bind(itemView)


        fun bind(city: City) = with(binding) {
            btnRadio.text = city.name



            btnRadio.apply {
                isChecked = selectedPosition == adapterPosition
                setOnClickListener {
                    checkItem()
                }
            }



            itemView.setOnClickListener {
                checkItem()

            }


        }
    }

    private fun MainViewHolder.checkItem() {
        notifyItemChanged(selectedPosition)

        selectedPosition = adapterPosition
    }

    companion object {
        private val DIFF_UTIL = object : DiffUtil.ItemCallback<City>() {
            override fun areItemsTheSame(oldItem: City, newItem: City): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: City, newItem: City): Boolean {
                return oldItem == newItem
            }
        }
    }
}