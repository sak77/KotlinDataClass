package com.saket.kotlindataclass

/**
 * On the JVM, if the generated class needs to have a parameterless constructor,
 * default values for all properties have to be specified.
 */
data class Parent(val sirName: String = "Default", val age: Int = 30) {
    var name = ""   //In Kotlin it is important to initialize the variable. Or you have to use lateinit or lazy.
}
