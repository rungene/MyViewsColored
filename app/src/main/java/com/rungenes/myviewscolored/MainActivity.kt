package com.rungenes.myviewscolored

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                textViewBxOne,
                textViewBxTwo,
                textViewBxThree,
                textViewBxFour,
                textViewBxFive,
                constrainedLayout,
                buttonGreen,
                buttonRed,
                buttonYellow
            )

        for (item in clickableViews) {
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

            //boxes using custom colors for background
            R.id.buttonRed -> textViewBxThree.setBackgroundResource(R.color.my_red)
            R.id.buttonYellow -> textViewBxFour.setBackgroundResource(R.color.my_yellow)
            R.id.buttonGreen -> textViewBxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

        when (view.id) {
            R.id.buttonRed -> buttonRed.setBackgroundResource(R.color.my_red)
            R.id.buttonYellow -> buttonYellow.setBackgroundResource(R.color.my_yellow)
            R.id.buttonGreen -> buttonGreen.setBackgroundResource(R.color.my_green)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
      return  when (item.itemId) {
            R.id.action_refresh -> {
                textViewBxOne.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                textViewBxTwo.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                textViewBxThree.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                textViewBxFour.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                textViewBxFive.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                buttonRed.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                buttonYellow.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                buttonGreen.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
                constrainedLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.my_color))
            true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}