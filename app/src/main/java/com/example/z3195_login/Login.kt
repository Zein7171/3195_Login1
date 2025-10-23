package com.example.z3195_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginconstrain)
        val et_user: EditText = findViewById(R.id.et_user)
        val et_pass: EditText = findViewById(R.id.et_pass)
        val bt_login: Button = findViewById(R.id.btn_login)
        val bt_regis: Button = findViewById(R.id.btn_regis)

        bt_login.setOnClickListener {
            val username = et_user.text.toString()
            val pindah: Intent = Intent(this, Dashboard::class.java)
            pindah.putExtra("nama", username)
            startActivity(pindah)
        }

        bt_regis.setOnClickListener {
            val pindah: Intent= Intent(this, RegisterActivity::class.java)
            startActivity(pindah)
        }
    }
}