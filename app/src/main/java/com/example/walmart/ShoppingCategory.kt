package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategory : AppCompatActivity() {

    fun showToast(category:String){
        Toast.makeText(this, "You have chosen the "+category+" category of shopping", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        val bundle: Bundle? = intent.extras
        textView6.text = "Welcome "+intent.getStringExtra("username")

        imageView1.setOnClickListener { showToast("Electronics")}
        imageView2.setOnClickListener { showToast("Clothing")}
        imageView3.setOnClickListener { showToast("Beauty")}
        imageView4.setOnClickListener { showToast("Food")}
    }
}
