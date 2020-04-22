fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("$this", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}