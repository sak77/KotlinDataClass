package com.saket.kotlindataclass

/**
 * Data class must have at least one primary constructor parameter.
 * This parameter can be val or var.
 * Data classes cannot be abstract, open, sealed or inner.
 * Data classes may extend other classes (but not data class).
 */
data class Student(val studentId: String, val parent: Parent) {
    /*
    The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
    To exclude a property from the generated implementations, declare it inside the class body:
     */
    var studentName = ""
    var age = 0
    var studentClass = 0
    var rollNo = 10
    var division = ""
    val sirName : String = parent.sirName

}
