// main function
fun main() {
    val text = "Java"
    val result = text.run {
        val from = this
        val to = this.replace("$from", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}