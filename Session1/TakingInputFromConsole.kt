fun main(){
    /** This will not work on Kotlin Playground **/
    
    // Taking simple input
    val input = readLine()
    
    // Integer input
    val intInput = readLine()!!.toInt()
    
    // Multiple inputs at the same time using map and split
    val (x, y, z) = readLine()!!.split(" ").map{ it.toInt() }
    // print(y+z)
}
