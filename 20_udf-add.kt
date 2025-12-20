fun addition() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    val sum = a + b
    println("Addition = $sum")
}

fun main() {
    addition()
}
