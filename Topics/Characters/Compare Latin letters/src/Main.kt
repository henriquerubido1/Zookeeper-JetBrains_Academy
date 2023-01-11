fun main() {
    val char1: Char = readln().first().uppercaseChar()
    val char2: Char = readln().first().uppercaseChar()

    if (char1 == char2) {
        println("true")
    } else {
        println("false")
    }
}