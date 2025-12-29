// Parent class
open class Parent{
    open fun display() {
        println("This is the Parent class method")
    }
}

// Child class
class Child : Parent() {
    override fun display() {
        // Call Parent's display method using super
        super.display()
        println("This is the Child class method")
    }
}

// Main function to test
fun main() {
    val child = Child()
    child.display()
}
