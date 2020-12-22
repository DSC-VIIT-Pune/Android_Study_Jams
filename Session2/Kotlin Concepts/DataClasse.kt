data class User(val name: String = "", val age: Int = 0)

fun main(){
    val user1 = User("Jimmy", 21)
    val user2 = User("Mike", 45)

    println(user1 == user2)

    val user3 = user1.copy()

    println(user1 == user3)
}