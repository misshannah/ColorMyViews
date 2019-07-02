package com.olukoye.hannah.colourmyviews

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.olukoye.hannah.colourmyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            val clickableViews: List<View> =
                listOf(textView, textView2, textView3,
                    textView4, textView5,red_button, green_button, yellow_button)

            for (item in clickableViews) {
                item.setOnClickListener { makeColored(it) }
            }

    }
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.textView -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textView2 -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.textView3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textView4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textView5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            //Buttons
            R.id.red_button -> textView3.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> textView4.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> textView5.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)


        }
    }
}
