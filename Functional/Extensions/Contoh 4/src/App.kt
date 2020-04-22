// main function
fun main() {
    val value: Int? = null

//  Menggunakan safe calls untuk menerima data null
    println(value?.slice)
//  Tanpa safe calls akan menghasilkan nilai default elvis operator
    println(value.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0