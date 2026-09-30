package com.example.baitap2_lab3.model

import java.io.Serializable

data class Student(
    val fullName: String,
    val msv: String,
    val studentClass: String,
    val age: Int,
    val email: String
) : Serializable
