package com.devraespim.supermarkethelp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.devraespim.supermarkethelp.MainApplication
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.ui.fragment.CategoriesFragment
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private val manager = supportFragmentManager
    private val categoriesFragmentTag = "CategoriesFragment"
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        manager.beginTransaction().add(R.id.conteiner_fragment, CategoriesFragment(), categoriesFragmentTag).commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        try {
            if (manager.findFragmentByTag(categoriesFragmentTag)?.isVisible!!) {
                supportActionBar?.title = "Principal - Categorias"
            }
        } catch (e: Exception){
            Log.e(TAG, "onBackPressed() " + e.message)
        }
    }
}