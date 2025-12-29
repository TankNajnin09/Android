// Base interface 1
interface Mydate {
    val date1: String
}

// Base interface 2
interface Mytime {
    val time1: String
}

// Derived class implementing multiple interfaces
class Mycalendar(override val date1: String, override val time1: String) : Mydate, Mytime {

    // display() method
    fun display() {
        println("Date: $date1")
        println("Time: $time1")
    }
}

// Main function to test
fun main() {
    val calendar = Mycalendar("2025-12-28", "21:30")
    calendar.display()
}
