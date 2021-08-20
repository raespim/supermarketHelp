package com.devraespim.supermarkethelp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.ui.activity.MainActivity
import com.devraespim.supermarkethelp.util.ModelPreferencesManager
import com.google.android.material.textfield.TextInputEditText

class CategoryDetailsFragment : Fragment() {
    private var getTitleCategory = ""
    private val prefs = ModelPreferencesManager
    private lateinit var product1: TextInputEditText
    private lateinit var product2: TextInputEditText
    private lateinit var product3: TextInputEditText
    private lateinit var product4: TextInputEditText
    private lateinit var product5: TextInputEditText
    private lateinit var product6: TextInputEditText
    private lateinit var product7: TextInputEditText
    private lateinit var product8: TextInputEditText
    private lateinit var product9: TextInputEditText
    private lateinit var product10: TextInputEditText
    private lateinit var product11: TextInputEditText
    private lateinit var product12: TextInputEditText
    private lateinit var product13: TextInputEditText
    private lateinit var product14: TextInputEditText
    private lateinit var product15: TextInputEditText

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
        setupSavingDataFromTitlePick(getTitleCategory)
    }

    private fun initializeViews(root: View) {
        product1 = root.findViewById(R.id.product_1)
        product2 = root.findViewById(R.id.product_2)
        product3 = root.findViewById(R.id.product_3)
        product4 = root.findViewById(R.id.product_4)
        product5 = root.findViewById(R.id.product_5)
        product6 = root.findViewById(R.id.product_6)
        product7 = root.findViewById(R.id.product_7)
        product8 = root.findViewById(R.id.product_8)
        product9 = root.findViewById(R.id.product_9)
        product10 = root.findViewById(R.id.product_10)
        product11 = root.findViewById(R.id.product_11)
        product12 = root.findViewById(R.id.product_12)
        product13 = root.findViewById(R.id.product_13)
        product14 = root.findViewById(R.id.product_14)
        product15 = root.findViewById(R.id.product_15)
    }

    private fun pickTitle() {
        (activity as MainActivity).supportActionBar?.title = "Categoria: ${getTitleCategory}"
    }

    private fun setupSavingDataFromTitlePick(categoryTitle: String) {
        when (categoryTitle) {
            "Limpeza" ->
            "Higiene" ->
                "Alimentos" ->
            "Bebidas" ->
            "Outros" ->
        }
    }

    private fun getTexts() {
        product1.text.toString()
        product2.text.toString()
        product3.text.toString()
        product4.text.toString()
        product5.text.toString()
        product6.text.toString()
        product7.text.toString()
        product8.text.toString()
        product9.text.toString()
        product10.text.toString()
        product11.text.toString()
        product12.text.toString()
        product13.text.toString()
        product14.text.toString()
        product15.text.toString()
    }
}