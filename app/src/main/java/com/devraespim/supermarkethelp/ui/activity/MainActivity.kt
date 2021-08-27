package com.devraespim.supermarkethelp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devraespim.supermarkethelp.R
import com.devraespim.supermarkethelp.ui.fragment.CategoriesFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportFragmentManager.beginTransaction().add(R.id.conteiner_fragment, CategoriesFragment()).commit()
    }
}