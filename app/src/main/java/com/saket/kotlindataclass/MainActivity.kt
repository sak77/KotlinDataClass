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
        var sampleInt: Int = 12

        //Primary constructor params have default values. So we can have empty constructor
        val parent1 = Parent("Verma", 34)
        parent1.name = "Shivkumar"
        //
        val student1 = Student("1234AEE", parent1)
        student1.studentName = "Manoj"
        student1.rollNo = 32

        val student2 = Student("1234AEE", parent1)
        student2.studentName = "Sunil"
        student2.rollNo = 46

        /*
        The compiler automatically derives the following members from all properties declared in the primary constructor:

        - equals()/ hashCode() pair
        - toString() of the form "User(name=John, age=42)"
        - componentN() functions corresponding to the properties in their order of declaration (Destructuring declarations).
        - copy() function.
         */
        val duplicateStudentMessage = if (student1.equals(student2)) {
            "Both students are same"
        } else {
            "Both students are different"
        }

        //toString()-
        println("Student 1 id ${student1.toString()}")
        println("Student 2 id ${student2.toString()}")

        println("Output: $duplicateStudentMessage")

        //copy()
        val newStudent = student1.copy()

        //While copying, you can also change some of the properties of the original object
        val newStudent2 = student2.copy(studentId = "1234AAD")
        println("New student details ${newStudent2.toString()}")

        //Component functions generated for data classes enable their use in destructuring declarations
        val (studentId, parent) = student1
        println("$studentId, $parent of student 1")

        val (studentId2, parent2) = student2
        println("$studentId2, $parent2 of student 1")
    }
}