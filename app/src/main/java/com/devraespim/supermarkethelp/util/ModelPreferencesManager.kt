package com.devraespim.supermarkethelp.util

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.devraespim.supermarkethelp.model.Cleaning
import com.google.gson.GsonBuilder

object ModelPreferencesManager {
    lateinit var preferences: SharedPreferences
    private const val PREFERENCES_FILE_NAME = "PREFERENCES_FILE_NAME"

    fun with(application: Application) {
        preferences = application.getSharedPreferences(PREFERENCES_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun insertCleaningObject(cleaningObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(cleaningObject)
        preferences.edit().putString(key, jsonString).apply()
    }

    fun insertDrinksObject(drinksObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(drinksObject)
        preferences.edit().putString(key, jsonString).apply()
    }

    fun insertFoodsObject(foodsObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(foodsObject)
        preferences.edit().putString(key, jsonString).apply()
    }

    fun insertHygieneObject(hygieneObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(hygieneObject)
        preferences.edit().putString(key, jsonString).apply()
    }

    fun insertOthersObject(othersObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(othersObject)
        preferences.edit().putString(key, jsonString).apply()
    }

    fun remove(key: String) = preferences.edit().remove(key).apply()
}