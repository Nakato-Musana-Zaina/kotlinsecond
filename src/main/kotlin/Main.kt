fun main () {
    name("Ada")
    modulus(87, 78)
    sum(59, 68, 87, 67)
    interestingfacts(" I love Dogs and srabble")
}
fun name( word: String){
    var text =" Hello ${word}"
    println(text)
}


fun modulus(num1: Int, num2: Int): Int {
    var result = num2%num1
    println(result)
    return result
}


fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var sum = num2 + num1 + num3 + num4
    println(sum)
    return sum
}

fun interestingfacts( word: String){
    println(word)

}