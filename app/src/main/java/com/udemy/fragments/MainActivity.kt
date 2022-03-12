package com.udemy.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var cb_replace : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cb_replace = findViewById(R.id.cb_replace)

        //fragment
        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        val frstFragmentObjt = FirstFragment()
        fragmentTransaction.add(R.id.frameLayOutId, frstFragmentObjt)
        fragmentTransaction.commit()

        cb_replace.setOnClickListener {
            //code to replace
            val secondFragManger : FragmentManager = supportFragmentManager
            val secondFragTrans : FragmentTransaction =  secondFragManger.beginTransaction()
            val secondFragmentObj = SecondFragment()
            secondFragTrans.replace(R.id.frameLayOutId, secondFragmentObj)
            secondFragTrans.commit()
        }

    }
}