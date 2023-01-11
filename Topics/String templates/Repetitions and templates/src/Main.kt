fun main() {
    val word: String = readln()

    fun repeater(str: String) {
        print("${str.length} repetitions of the word $str: ")
        repeat(str.length) {
            print(str)
        }
    }

    repeater(word)
}
