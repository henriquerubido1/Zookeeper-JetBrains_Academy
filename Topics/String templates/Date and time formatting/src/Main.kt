fun main() {
    val (a, b, c) = readln().split(' ')
    val (d, e, f) = readln().split(' ')

    val result: String = "$a:$b:$c $d/$e/$f"

    println(result)
}