// main function
fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "text length is $this"
        println(text)
    }

    val length = message?.length ?: 0
    val text =  "text length $length"
    println(text)
}