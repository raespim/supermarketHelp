package com.devraespim.supermarkethelp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.model.Category
import com.devraespim.supermarkethelp.ui.fragment.adapter.CategoriesAdapter

class CategoriesFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_categories, container, false)
        initializeViews(root)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun initializeViews(root: View) {
        recyclerView = root.findViewById(R.id.recyclerView_categories)
    }

    private fun addCategories() = mutableListOf(
        Category("Limpeza", R.drawable.ic_cleaning),
        Category("Higiene", R.drawable.ic_hygiene),
        Category("Alimentos", R.drawable.ic_foods),
        Category("Bebidas", R.drawable.ic_drinks),
        Category("Outros", R.drawable.ic_others)
    )

    private fun setupRecyclerView() {
        recyclerView.let {
            it.layoutManager = LinearLayoutManager(requireActivity())
            it.itemAnimator = DefaultItemAnimator()
            it.setHasFixedSize(true)
            it.adapter = CategoriesAdapter(addCategories()) { categoryTitle ->
                arguments = Bundle().apply {
                    putString("category", categoryTitle)
                }
                findNavController().navigate(
                    R.id.action_CategoriesFragment_to_CategoryDetailsFragment,
                    arguments
                )
            }
        }
    }
}