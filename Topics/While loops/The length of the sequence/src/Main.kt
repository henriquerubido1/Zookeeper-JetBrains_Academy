import java.util.*

fun main() {
    var sequenceLength: Int = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextInt() && scanner.next() != "0") {
        sequenceLength += 1
    }

    println(sequenceLength)
}