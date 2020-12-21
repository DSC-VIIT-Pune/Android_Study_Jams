fun main(){
    /**
     * Int, Float, Double, Boolean, String, ...
     */

    // Standard way of declaring and initializing variables
    val name : String = "My name"

    // Types can be omitted
    val anotherName = "Another name"
    var number = 1

    // Cannot assign null
//     number = null

    /** Nullable and non-nullable types **/
    // Nullables (question mark at the end)
    var nullableVar : String?
    nullableVar = "I am nullable"
    nullableVar = null

    // Another example
    var nullableInt : Int? = null
    nullableInt = 7

    println("Nullable var = $nullableVar\nNullable Int = $nullableInt")

    // Safe calls using ?.
    nullableVar = "Nullable String"
    println("Length of string is ${nullableVar?.length}")
    nullableVar = null
    println("Length of string is ${nullableVar?.length}")

    // Double bang operator !! (Will give NPE if the value is null)
    // println(nullableVar!!.length)

    /** Elvis Operator **/
    val length : Int = nullableVar?.length ?: -1
    println("The length of nullable var is $length")
}