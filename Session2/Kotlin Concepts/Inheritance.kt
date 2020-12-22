open class Shape(open val vertices : Int = 0){
  // ..
}

class Square(val sideLength : Int) : Shape(){
  override val vertices : Int = 4
    
  fun area() = sideLength * sideLength
}

fun main(){
    val square = Square(4)
    print(square.area())
}