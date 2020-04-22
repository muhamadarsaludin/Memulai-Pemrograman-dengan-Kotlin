fun main() {
    val capital = mutableMapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )
    println(capital)

    capital.put("Amsterdam", "Netherlands")
    capital["Berlin"] = "Germany"
    capital["Berlin"] = "Argentina"
    capital.remove("London")

    println(capital)
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}