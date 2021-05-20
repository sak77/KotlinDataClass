package com.saket.kotlindataclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * You often create classes whose main purpose is to hold data.
 * In such classes, some standard functionality and utility functions are often mechanically derivable from the data.
 * In Kotlin, these are called data classes and are marked with data.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sampleInt: Int

        sampleInt = 12

        //Primary constructor params have default values. So we can have empty constructor
        val sunil = Parent()
        //
        val student1 = Student("1234AEE")
        student1.studentName = ""
        student1.rollNo = 32
        val student2 = Student("1234AEE")

        /*
        The compiler automatically derives the following members from all properties declared in the primary constructor:

        - equals()/ hashCode() pair
        - toString() of the form "User(name=John, age=42)"
        - componentN() functions corresponding to the properties in their order of declaration (Destructuring declarations).
        - copy() function.
         */
        val duplicateStudentMessage = if (manoj.equals(ankit)) {
            "Both students are same"
        } else {
            "Both students are different"
        }

        println("Output: $duplicateStudentMessage")
    }
}