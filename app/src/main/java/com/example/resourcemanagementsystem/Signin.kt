package com.example.resourcemanagementsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_signin.*

class signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        btnLogin.setOnClickListener { view ->
            if (Uname.text.toString() == "" && Upwd.text.toString() == "") {
                Snackbar.make(view, "field must be required!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else {
                if (Uname.text.toString().equals(Upwd.text.toString())) {
                    Snackbar.make(view, "login successful", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                    Handler().postDelayed(
                        {
                            var i = Intent(this, Navigation::class.java)
                            startActivity(i)
                            finish()
                        }, 500
                    )

                } else {
                    Snackbar.make(view, "username or password is incorrect!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }
            }
        }


        lblsignin.setOnClickListener() {
            var i = Intent(this, signup::class.java)
            startActivity(i)
            finish()
        }

    }
}
