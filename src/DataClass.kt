data class DataClass(val name: String, val id: Int) {           // 1

    override fun equals(other: Any?) =
        other is DataClass && other.id == this.id               // 2
}

fun main() {
    val user = DataClass("Stuart", 15)
    println(user)                                               // 3

    val secondUser = DataClass("Stuart", 15)
    val thirdUser = DataClass("Sam", 9)

    println("user == secondUser: ${user == secondUser}")        // 4
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())                                    // 5
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())                                        // 6
    println(user == user.copy())                                // 7
    println(user.copy("Sam"))                             // 8
    println(user.copy(id = 3))                                  // 9

    println("name = ${user.component1()}")                      // 10
    println("id = ${user.component2()}")

}