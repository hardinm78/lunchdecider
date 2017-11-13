package com.mikehardinapps.lunchdecider

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val placeList = arrayListOf("Wasabi","Chik-Fil-A","Subway","Martins","Keifers","Hal and Mals")
    val placeList2 = arrayListOf("Outback","Spice Avenue","Red Lobster","Tokyo Tasty")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener{

            if (!bessieCheck.isChecked){
                val rand = Random()
                val randomPlaceIndex = rand.nextInt(placeList.count())
                selectedFoodText.text = placeList[randomPlaceIndex]
            }else {
                val rand = Random()
                val randomPlaceIndex = rand.nextInt(placeList2.count())
                selectedFoodText.text = placeList2[randomPlaceIndex]
            }


        }

    }
}
