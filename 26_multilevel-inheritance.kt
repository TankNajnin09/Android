// Base class
open class Person1(var name: String, var age: Int)
// Intermediate class
open class Student1(name: String, age: Int, var rollno: Int) : Person(name, age)

// Derived class
class Result(name: String, age: Int, rollno: Int, var percentage: Double) : Student1(name, age, rollno) {

    fun display() {
        println("Roll No: $rollno")
        println("Name: $name")
        println("Age: $age")
        println("Percentage: $percentage%")
    }
}

// Main function to test
fun main() {
    val studentResult = Result("Rukesh", 20, 101, 88.5)
    studentResult.display()
}
