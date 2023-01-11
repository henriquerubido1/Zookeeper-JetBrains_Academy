fun main() {
    val repetitions: Int = readln().toInt()

    var divisibleNum: Int = 0

    repeat(repetitions) {
        val next = readln().toInt()

        if (next % 4 == 0 && next > divisibleNum) {
            divisibleNum = next
        }
    }

    println(divisibleNum)
}