package com.lauren.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first()
        sum(4, 7)
        fullName("Sabir", "Halil")
        val q = sum2(7, 9)
        println(q)
        println(q + 8)

        val student = Student(20,"Mohammed","halil","Medicine")
        println(student.nameInput)


    }
    // With parameters and return
    fun sum2(num: Int, num1: Int): Int {
        val result = num * num1
        return result
    }
    // With parameters
    fun sum(num1: Int, num2: Int) {
        println(num1 + num2)
    }
    // With parameters
    fun fullName(name: String, surname: String) {
        println(name + " " + surname)
    }
    // No parameters no return
    fun first() {
        println("first fun worked")
    }


}