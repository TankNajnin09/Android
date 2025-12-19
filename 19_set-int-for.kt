fun main() {
    // Create a mutable set of integers
    val numbers = mutableSetOf<Int>()

    // Add elements to the set
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    numbers.add(40)

    // Print all elements using a loop
    for (num in numbers) {
        println(num)
    }
}
