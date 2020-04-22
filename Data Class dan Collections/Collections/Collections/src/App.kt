class User

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val user=User()
    val mutableList: MutableList<Any> = mutableListOf('a', 1, true, user)

    val anyList = listOf('a', "Kotlin", 3, true, User())

    mutableList.add('x')
    mutableList[2] = false
    mutableList.remove(user)
    print(mutableList)
}