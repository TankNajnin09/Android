fun square(num: Int) {
    val result = num * num
    println("Square of $num = $result")
}

fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    square(n)
}
