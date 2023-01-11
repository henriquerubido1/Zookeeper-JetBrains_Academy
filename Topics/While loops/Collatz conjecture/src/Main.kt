fun main() {
    var naturalNum: Int = readln().toInt()
    var result = "$naturalNum"

    while (naturalNum > 1) {
        if (naturalNum % 2 == 0) {
            naturalNum /= 2
            result += " $naturalNum"
        } else {
            (naturalNum * 3 + 1).also { naturalNum = it }
            result += " $naturalNum"
        }
    }

    println(result)
}