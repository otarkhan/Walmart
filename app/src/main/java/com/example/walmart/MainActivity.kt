package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val db:MutableList<User> = ArrayList();

    fun dbInit(){
        db.add(User("user1","1234"));
        db.add(User("user2","1234"));
        db.add(User("user3","1234"));
        db.add(User("user4","1234"));
        db.add(User("user5","1234"));
    }

    fun validate(){
        for (user:User in db) {
            //Toast.makeText(this, editText.text.toString()+"|"+editText3.text.toString(), Toast.LENGTH_LONG).show()

            if (user.username.equals(editText.text.toString())) {
                if (user.password.equals(editText3.text.toString())){
                    //Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, ShoppingCategory::class.java);
                    intent.putExtra("username", user.username)
                    startActivity(intent);
                }
                else{
                    //Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show()
                    return;
                }
            }
        }
        //Toast.makeText(this, "Not found", Toast.LENGTH_LONG).show()
    }

    fun signup(){
        val intent = Intent(this, RegisterActivity::class.java);
        startActivity(intent);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbInit()
        button2.setOnClickListener { validate() };
        button3.setOnClickListener { signup() }
    }
}
