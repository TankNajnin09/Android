fun main() {
    print("Enter a number to find factorial: ")
    val num = readLine()!!.toInt()

    var i = 1
    var fact = 1

    while (i <= num) {
        fact *= i
        i++
    }

    println("Factorial of $num is: $fact")
}
