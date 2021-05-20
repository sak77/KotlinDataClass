package com.saket.kotlindataclass

/**
 * Data class must have at least one primary constructor parameter.
 * This parameter can be val or var.
 * Data classes cannot be abstract, open, sealed or inner.
 * Data classes may extend other classes (but not data class).
 */
data class Student(val studentId: String) {
    /*
    The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
    To exclude a property from the generated implementations, declare it inside the class body:
     */
    var studentName = String()
        get() = field
        set(value) {
            field = value
        }
    var age = Int
        get() = field
        set(value) {
            field = value
        }
    var studentClass = Int
        get() = field
        set(value) {
            field = value
        }
    var rollNo = Int
        get() = field
        set(value) {
            field = value
        }


    var division = Char
        get() = field
        set(value) {
            field = value
        }
    var sirName = String()
        get() = field
        set(value) {
            field = value
        }
}
