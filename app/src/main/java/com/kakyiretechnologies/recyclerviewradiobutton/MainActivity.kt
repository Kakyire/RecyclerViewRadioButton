package com.kakyiretechnologies.recyclerviewradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakyiretechnologies.recyclerviewradiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val cityList = mutableListOf<City>()

    private  lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i in cities) {
            val city = City(name = i)
            cityList.add(city)
        }
        val mainAdapter = MainAdapter()
        mainAdapter.submitList(cityList)

        binding.rvCities.adapter =mainAdapter

    }


    private val cities = listOf(
        "Accra",
        "Kumasi",
        "Sekondi-Takoradi",
        "Sunyani",
        "Tamale",
        "Ashaiman",
        "Cape Coast",
        "Obuasi",
        "Teshie",
        "Tema",
        "Madina",
        "Koforidua",
        "Wa",
        "Techiman",
        "Ho",
        "Nungua",
        "Lashbi",
        "Dome",
        "Tema New Town",
        "Gbawe",
        "Ejura",
        "Taifa",
        "Bawku",
        "Aflao",
        "Agona Swedru"
    )

}