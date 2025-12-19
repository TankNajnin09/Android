fun main() {
    // Immutable map with keys and city names
    val cities = mapOf(
        1 to "Mumbai",
        2 to "Delhi",
        3 to "Chennai"
    )

    // Print cities based on key using loop
    for ((key, value) in cities) {
        println("Key: $key, City: $value")
    }
}
