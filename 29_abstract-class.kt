// Abstract class
abstract class Shape {
    abstract fun area(): Double
}

// Derived class
class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override fun area(): Double {
        return length * width
    }
}

// Main function to test
fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    println("Area of the rectangle: ${rectangle.area()}")
}
