package com.rungenes.myviewscolored

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews:List<View> =
            listOf(textViewBxOne,textViewBxTwo,textViewBxThree,
                textViewBxFour,textViewBxFive,constrainedLayout)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.textViewBxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textViewBxTwo -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textViewBxThree -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textViewBxFour -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textViewBxFive -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }
}
