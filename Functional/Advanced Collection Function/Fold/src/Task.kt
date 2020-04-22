fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
}