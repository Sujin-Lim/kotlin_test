package com.sj.photoalbum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        화면에 보이기
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        화면 클릭 확인
        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener {
            Toast.makeText(this, "첫 번째 사진 클릭", Toast.LENGTH_LONG).show()
            //        화면 클릭시 다음 화면으로 넘어가서 사진을 크게 보여줌
            val intent = Intent(this, img1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.image_2)
        image2.setOnClickListener {
            Toast.makeText(this, "두 번째 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this, img2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.image_3)
        image3.setOnClickListener {
            Toast.makeText(this, "세 번째 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this, img3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.image_4)
        image4.setOnClickListener {
            Toast.makeText(this, "네 번째 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this, img4Activity::class.java)
            startActivity(intent)
        }
        val image5 = findViewById<ImageView>(R.id.image_5)
        image5.setOnClickListener {
            Toast.makeText(this, "첫번째 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this, img5Activity::class.java)
            startActivity(intent)
        }



    }
}