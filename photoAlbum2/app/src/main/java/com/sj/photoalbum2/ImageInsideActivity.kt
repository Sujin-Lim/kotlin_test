package com.sj.photoalbum2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")

        Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        val img = findViewById<ImageView>(R.id.imgArea)

        if (getData == "1") {
            img.setImageResource(R.drawable.test1)
        }
        if (getData == "2") {
            img.setImageResource(R.drawable.test2)
        }
        if (getData == "3") {
            img.setImageResource(R.drawable.test3)
        }
        if (getData == "4") {
            img.setImageResource(R.drawable.test4)
        }
        if (getData == "5") {
            img.setImageResource(R.drawable.test5)
        }
        if (getData == "6") {
            img.setImageResource(R.drawable.test6)
        }
        if (getData == "7") {
            img.setImageResource(R.drawable.test7)
        }
        if (getData == "8") {
            img.setImageResource(R.drawable.test8)
        }
        if (getData == "9") {
            img.setImageResource(R.drawable.test9)
        }

    }
}