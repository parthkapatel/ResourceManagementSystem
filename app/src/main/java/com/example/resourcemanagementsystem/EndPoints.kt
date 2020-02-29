package com.example.resourcemanagementsystem

object EndPoints {
    private var URL = "https://12b25fa9.ngrok.io/WebApi/v1/"
    val URL_ADD_: String = URL + "addDept"
    val URL_ADD_DEPT: String = "https://12b25fa9.ngrok.io/WebApi/v1/?op=addDept&dname=12&duname=12&dpwd=22"
    val URL_GET_DEPT: String = URL + "getDept"
}