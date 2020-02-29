package com.example.resourcemanagementsystem

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_signup.*
import org.json.JSONException
import org.json.JSONObject


class signup : AppCompatActivity() {

    private var URL = "http://192.168.1.7/WebApi/v1/?op="
    val URL_ADD_DEPT: String = URL + "addDept"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)



        btnsignup.setOnClickListener { view ->

            val dname = rname.text.toString()
            val duname = runame.text.toString()
            val dpwd = rpwd.text.toString()

            if (dname == "" || duname == "" || dpwd == "") {
                Snackbar.make(view, "field must be required!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            } else {

                this.addDept()

                Snackbar.make(view, "Register successfully", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                Handler().postDelayed(
                    {
                        var i = Intent(this, signin::class.java)
                        startActivity(i)
                        finish()
                    }, 500
                )
                /* } else {
                    Snackbar.make(view, "username or password is incorrect!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }*/
            }
        }

        lblsignup.setOnClickListener()
        {
            var i = Intent(this, signin::class.java)
            startActivity(i)
            finish()
        }


    }

    private fun addDept() {

        val dname = rname.text.toString()
        val duname = runame.text.toString()
        val dpwd = rpwd.text.toString()


        /*   val stringRequest = object : StringRequest(
            Method.POST,
            EndPoints.URL_ADD_DEPT, Response.Listener<String>() { response ->
                try {
                    val obj = JSONObject(response)

                    Toast.makeText(
                        applicationContext,
                        obj.getString("message"),
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            },
            Response.ErrorListener() { volleyError ->
                Toast.makeText(applicationContext, volleyError.message, Toast.LENGTH_LONG).show()
            }) {

            @Throws(AuthFailureError::class)
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["dname"] = dname
                params["duname"] = duname
                params["dpwd"] = dpwd
                return params

            }

        }

        VolleySingleton.instance?.addToRequestQueue(stringRequest)
        //Toast.makeText(this, "$dname $duname $dpwd", Toast.LENGTH_LONG)
        Toast.makeText(this, stringRequest.toString(), Toast.LENGTH_LONG).show()*/

        val queue = Volley.newRequestQueue(this)
        val url = "https://0dd29727.ngrok.io/WebApi/v1/?op=addDept"

// Request a string response from the provided URL.
        val stringRequest = object : StringRequest(Request.Method.POST, url,
            Response.Listener<String> { response ->
                try {
                    val obj = JSONObject(response)

                    Toast.makeText(
                        applicationContext,
                        obj.getString("message"),
                        Toast.LENGTH_LONG
                    ).show()

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            },
            Response.ErrorListener() { volleyError ->
                Toast.makeText(applicationContext, volleyError.message, Toast.LENGTH_LONG).show()
            }) {
            @Throws(AuthFailureError::class)
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["dname"] = dname
                params["duname"] = duname
                params["dpwd"] = dpwd
                return params

            }
        }

// Add the request to the RequestQueue.
        queue.add(stringRequest)


    }
}
