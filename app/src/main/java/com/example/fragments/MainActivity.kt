package com.example.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val mFragmentOneButton: Button by lazy { findViewById(R.id.button_one) }
    private val mFragmentTwoButton: Button by lazy { findViewById(R.id.button_two) }

    val fragmentOne = FragmentOne()
    val fragmentTwo = FragmentTwo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragmentOneButton.setOnClickListener(this)
        mFragmentTwoButton.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.button_one -> {

                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fcv, fragmentOne)
                    .commit()

            }

            R.id.button_two -> {

                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_fcv, fragmentTwo)
                    .commit()
            }
        }
    }
}

