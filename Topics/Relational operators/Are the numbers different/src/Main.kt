fun main() {
    // put your code here
    val num1: Int = readln().toInt()
    val num2: Int = readln().toInt()
    val num3: Int = readln().toInt()

    if (num1 != num2 && num2 != num3 && num3 != num1) {
        println("true")
    } else {
        println("false")
    }
}