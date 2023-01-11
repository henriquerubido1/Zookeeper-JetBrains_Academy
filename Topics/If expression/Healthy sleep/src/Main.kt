fun main() {    
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val h: Int = readln().toInt()

    if (h in a..b) {
        println("Normal")
    } else if (h < a) {
        println("Deficiency")
    } else {
        print("Excess")
    }
}