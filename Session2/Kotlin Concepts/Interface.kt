interface SuperHero{
    val canFly : Boolean
    fun printInfo()
}

class MarvelHero(val name : String) : SuperHero {
    override val canFly = true
    override fun printInfo(){
        println("Hello, I'm $name and I can fly!")
    }
}

fun main(){
    val hero1 = MarvelHero("Iron Man")
    hero1.printInfo()
}