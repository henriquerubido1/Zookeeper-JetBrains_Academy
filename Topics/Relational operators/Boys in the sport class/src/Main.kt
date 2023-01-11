fun main() {
    val h1: Int = readln().toInt()
    val h2: Int = readln().toInt()
    val h3: Int = readln().toInt()

    if (h2 in h1..h3 || h2 in h3..h1) {
        println("true")
    } else {
        println("false")
    }
}