package com.example.walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    fun addAccount(){
        //val user: User = User(email.text.toString(), password.text.toString())
        Toast.makeText(this, "User has been created successfully", Toast.LENGTH_LONG).show()

        val intent = Intent(this, MainActivity::class.java);
        intent.putExtra("newEmail", email.text.toString())

        startActivity(intent);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerButton.setOnClickListener { addAccount() }
    }
}
