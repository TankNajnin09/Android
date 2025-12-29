// Base class
open class Person2(var name: String, var age: Int)

// Derived class 1
class Student2(name: String, age: Int, var percentage: Double) : Person(name, age) {

    fun display1() {
        println("Name: $name")
        println("Age: $age")
        println("Percentage: $percentage%")
    }
}

// Derived class 2
class Employee1(name: String, age: Int, var salary: Double) : Person2(name, age) {

    fun display2() {
        println("Name: $name")
        println("Age: $age")
        println("Salary: $$salary")
    }
}

// Main function to test
fun main() {
    val student = Student2("Rukesh", 20, 88.5)
    val employee = Employee1("Anil", 30, 50000.0)

    println("Student Details:")
    student.display1()
    println("\nEmployee Details:")
    employee.display2()
}
