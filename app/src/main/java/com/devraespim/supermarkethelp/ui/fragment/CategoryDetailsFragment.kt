package com.devraespim.supermarkethelp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.ui.activity.MainActivity

class CategoryDetailsFragment : Fragment() {
    private var getTitleCategory = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            val args = arguments
            getTitleCategory = args?.getString("category").toString().trim()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_category_details, container, false)
        pickTitle()
        initializeViews(root)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupLayoutFromTitlePick(getTitleCategory)
    }

    private fun initializeViews(root: View) {
    }

    private fun pickTitle() {
        (activity as MainActivity).supportActionBar?.title = "Categoria: ${getTitleCategory}"
    }

    private fun setupLayoutFromTitlePick(categoryTitle: String) {
//        when (categoryTitle) {
//            "Limpeza" -> findNavController().navigate()
//            "Higiene" ->
//                "Alimentos" ->
//            "Bebidas" ->
//            "Outros" ->
//        }
    }
}