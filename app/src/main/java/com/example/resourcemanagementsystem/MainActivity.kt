package com.example.resourcemanagementsystem

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo

        if (networkInfo != null && networkInfo.isConnected) {
            //You are connected to the internet
            if (networkInfo.type == ConnectivityManager.TYPE_WIFI) {
                Handler().postDelayed(
                    {
                        Toast.makeText(this, "Wifi is connected", Toast.LENGTH_LONG).show()
                        val i = Intent(this, signin::class.java)
                        startActivity(i)
                        finish()
                    }, 3000
                )
            }
            if (networkInfo.type == ConnectivityManager.TYPE_MOBILE) {
                Handler().postDelayed(
                    {
                        Toast.makeText(this, "Internet is connected", Toast.LENGTH_LONG).show()
                        val i = Intent(this, signin::class.java)
                        startActivity(i)
                        finish()
                    }, 3000
                )
            }
        } else {
            Toast.makeText(this, "No internet connection", Toast.LENGTH_LONG).show()
            Handler().postDelayed(
                {
                    //Toast.makeText(this,"Connected via MOBILE Network", Toast.LENGTH_LONG).show()
                    finish()
                }, 3000
            )
        }
    }
}
