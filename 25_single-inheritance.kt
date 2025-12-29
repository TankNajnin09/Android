// Base class
open class Person(
    var name: String,
    var age: Int
)

// Derived class
class Student(
    name: String,
    age: Int,
    var rollno: Int
) : Person(name, age) {

    // Display method
    fun display() {
        println("Roll No : $rollno")
        println("Name    : $name")
        println("Age     : $age")
    }
}

// Main function
fun main() {
    // Creating object of Student class
    val student = Student("Rukesh", 20, 101)

    // Calling display method
    student.display()
}
