fun cube(): Int {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    return num * num * num
}

fun main() {
    val result = cube()
    println("Cube = $result")
}
