fun main() {
    // write your code here
    val peanutButterCups: Int = readln().toInt()
    val isWeekend: Boolean = readln().toBoolean()

    if (isWeekend) {
        if (peanutButterCups in 15..25) {
            println("true")
        } else {
            println("false")
        }
    } else {
        if (peanutButterCups in 10..20) {
            println("true")
        } else {
            println("false")
        }
    }
}