class Shape(val side : Int){
    init{
        println("Init block 1")
    }
    constructor() : this(0){
        println("Secondary Constructor")
    }
    init{
        println("Init block 2")
    }
}


fun main(){
    // Secondary
    val shape1 = Shape()

    // Primary
    val shape2 = Shape(2)
}