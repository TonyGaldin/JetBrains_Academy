import java.util.Random

class ObjectKeyword {                           // 1)
    fun getNumber() {                           // 2)
        var objRandom = Random();
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val onePerson = ObjectKeyword()             // 3)
    val secondPerson = ObjectKeyword()          //

    onePerson.getNumber()                       // 4)
    secondPerson.getNumber()                    //
}

