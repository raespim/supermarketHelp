package com.devraespim.supermarkethelp.ui.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.model.Category
import kotlinx.android.synthetic.main.cardview_item_category.view.*

class CategoriesAdapter(
    val categories: MutableList<Category>,
    val onClick: (String) -> Unit
) : RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoriesViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_category, parent, false)
    )

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val category = categories[position]
        val view = holder.itemView
        with(view){
            cardview_title.text = category.titleCategory
            cardview_image.setImageResource(category.imageCategory)
            cardview.setOnClickListener {
                onClick(category.titleCategory)
            }
        }
    }

    override fun getItemCount() = categories.size

    class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view)
}