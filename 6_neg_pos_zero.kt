fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    if (num > 0) {
        println("The number is Positive")
    } else if (num < 0) {
        println("The number is Negative")
    } else {
        println("The number is Zero")
    }
}
