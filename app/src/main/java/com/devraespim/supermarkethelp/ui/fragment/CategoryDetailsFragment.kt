package com.devraespim.supermarkethelp.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.model.*
import com.devraespim.supermarkethelp.ui.activity.MainActivity
import com.devraespim.supermarkethelp.util.ModelPreferencesManager
import com.google.android.material.textfield.TextInputEditText
import java.lang.Exception

class CategoryDetailsFragment : Fragment() {
    private var getTitleCategory = ""
    private val prefs = ModelPreferencesManager
    private lateinit var btnSave: Button
    private lateinit var btnRemove: Button
    private lateinit var product1: EditText
    private lateinit var product2: EditText
    private lateinit var product3: EditText
    private lateinit var product4: EditText
    private lateinit var product5: EditText
    private lateinit var product6: EditText
    private lateinit var product7: EditText
    private lateinit var product8: EditText
    private lateinit var product9: EditText
    private lateinit var product10: EditText
    private lateinit var product11: EditText
    private lateinit var product12: EditText
    private lateinit var product13: EditText
    private lateinit var product14: EditText
    private lateinit var product15: EditText

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
        setupToolbarPickTitle()
        initializeViews(root)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        try {
            setupSavingAndRemoveDataFromTitlePick(getTitleCategory)
            showSavedDataFromTitlePick(getTitleCategory)
        } catch (e: Exception){
            Log.e("onViewCreated()", e.message.toString())
        }
    }

    private fun setupToolbarPickTitle() {
        (activity as MainActivity).supportActionBar?.title = "Categoria: ${getTitleCategory}"
    }

    private fun initializeViews(root: View) {
        btnSave = root.findViewById(R.id.btn_save_list)
        btnRemove = root.findViewById(R.id.btn_remove_list)
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

    private fun setupSavingAndRemoveDataFromTitlePick(categoryTitle: String) {
        when (categoryTitle) {
            "Limpeza" -> {
                onBtnSaveClick("KEY_CLEANING")
                onBtnRemoveClick("KEY_CLEANING")
            }
            "Higiene" -> {
                onBtnSaveClick("KEY_HYGIENE")
                onBtnRemoveClick("KEY_HYGIENE")
            }
            "Alimentos" -> {
                onBtnSaveClick("KEY_FOODS")
                onBtnRemoveClick("KEY_FOODS")
            }
            "Bebidas" -> {
                onBtnSaveClick("KEY_DRINKS")
                onBtnRemoveClick("KEY_DRINKS")
            }
            "Outros" -> {
                onBtnSaveClick("KEY_OTHERS")
                onBtnRemoveClick("KEY_OTHERS")
            }
        }
    }

    private fun showSavedDataFromTitlePick(titleCategory: String) {
        when (titleCategory) {
            "Limpeza" -> getCleaningSavedData()
            "Higiene" -> getHygieneSavedData()
            "Alimentos" -> getFoodsSavedData()
            "Bebidas" -> getDrinksSavedData()
            "Outros" -> getOthersSavedData()
        }
    }

    private fun getOthersSavedData() {
        val getObject = prefs.getOthersObject("KEY_OTHERS")
        product1.setText(getObject.product1)
        product2.setText(getObject.product2)
        product3.setText(getObject.product3)
        product4.setText(getObject.product4)
        product5.setText(getObject.product5)
        product6.setText(getObject.product6)
        product7.setText(getObject.product7)
        product8.setText(getObject.product8)
        product9.setText(getObject.product9)
        product10.setText(getObject.product10)
        product11.setText(getObject.product11)
        product12.setText(getObject.product12)
        product13.setText(getObject.product13)
        product14.setText(getObject.product14)
        product15.setText(getObject.product15)
    }

    private fun getDrinksSavedData() {
        val getObject = prefs.getDrinksObject("KEY_DRINKS")
        product1.setText(getObject.product1)
        product2.setText(getObject.product2)
        product3.setText(getObject.product3)
        product4.setText(getObject.product4)
        product5.setText(getObject.product5)
        product6.setText(getObject.product6)
        product7.setText(getObject.product7)
        product8.setText(getObject.product8)
        product9.setText(getObject.product9)
        product10.setText(getObject.product10)
        product11.setText(getObject.product11)
        product12.setText(getObject.product12)
        product13.setText(getObject.product13)
        product14.setText(getObject.product14)
        product15.setText(getObject.product15)
    }

    private fun getFoodsSavedData() {
        val getObject = prefs.getFoodsObject("KEY_FOODS")
        product1.setText(getObject.product1)
        product2.setText(getObject.product2)
        product3.setText(getObject.product3)
        product4.setText(getObject.product4)
        product5.setText(getObject.product5)
        product6.setText(getObject.product6)
        product7.setText(getObject.product7)
        product8.setText(getObject.product8)
        product9.setText(getObject.product9)
        product10.setText(getObject.product10)
        product11.setText(getObject.product11)
        product12.setText(getObject.product12)
        product13.setText(getObject.product13)
        product14.setText(getObject.product14)
        product15.setText(getObject.product15)
    }

    private fun getHygieneSavedData() {
        val getObject = prefs.getHygieneObject("KEY_HYGIENE")
        product1.setText(getObject.product1)
        product2.setText(getObject.product2)
        product3.setText(getObject.product3)
        product4.setText(getObject.product4)
        product5.setText(getObject.product5)
        product6.setText(getObject.product6)
        product7.setText(getObject.product7)
        product8.setText(getObject.product8)
        product9.setText(getObject.product9)
        product10.setText(getObject.product10)
        product11.setText(getObject.product11)
        product12.setText(getObject.product12)
        product13.setText(getObject.product13)
        product14.setText(getObject.product14)
        product15.setText(getObject.product15)
    }

    private fun getCleaningSavedData() {
        val getObject = prefs.getCleaningObject("KEY_CLEANING")
        product1.setText(getObject.product1)
        product2.setText(getObject.product2)
        product3.setText(getObject.product3)
        product4.setText(getObject.product4)
        product5.setText(getObject.product5)
        product6.setText(getObject.product6)
        product7.setText(getObject.product7)
        product8.setText(getObject.product8)
        product9.setText(getObject.product9)
        product10.setText(getObject.product10)
        product11.setText(getObject.product11)
        product12.setText(getObject.product12)
        product13.setText(getObject.product13)
        product14.setText(getObject.product14)
        product15.setText(getObject.product15)
    }

    private fun onBtnSaveClick(key: String) {
        btnSave.setOnClickListener {
            when (key) {
                "KEY_CLEANING" -> insertCleaningObject()
                "KEY_HYGIENE" -> insertHygieneObject()
                "KEY_FOODS" -> insertFoodsObject()
                "KEY_DRINKS" -> insertDrinksObject()
                "KEY_OTHERS" -> insertOthersObject()
            }
        }
    }

    private fun onBtnRemoveClick(key: String) {
        btnRemove.setOnClickListener {
            when (key) {
                "KEY_CLEANING" -> removeObject("KEY_CLEANING")
                "KEY_HYGIENE" -> removeObject("KEY_HYGIENE")
                "KEY_FOODS" -> removeObject("KEY_FOODS")
                "KEY_DRINKS" -> removeObject("KEY_DRINKS")
                "KEY_OTHERS" -> removeObject("KEY_OTHERS")
            }
        }
    }

    private fun removeObject(key: String) = prefs.remove(key)

    private fun insertCleaningObject() {
        prefs.insertCleaningObject(
            Cleaning(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ), "KEY_CLEANING"
        )
    }

    private fun insertHygieneObject() {
        prefs.insertHygieneObject(
            Hygiene(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ), "KEY_HYGIENE"
        )
    }

    private fun insertFoodsObject() {
        prefs.insertFoodsObject(
            Foods(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ), "KEY_FOODS"
        )
    }

    private fun insertDrinksObject() {
        prefs.insertDrinksObject(
            Drinks(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ), "KEY_DRINKS"
        )
    }

    private fun insertOthersObject() {
        prefs.insertOthersObject(
            Others(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ), "KEY_DRINKS"
        )
    }

}