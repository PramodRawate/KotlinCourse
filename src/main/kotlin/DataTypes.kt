package datatypes

fun main(args: Array<String>) {

    var a = 10
    var b = 14L

    println("Int: $a")
    println("Long: $b")

    b = a.toLong()
    println(b is Long)

    var c = 'A'
    var d = 69
    println("Char is $c")
    println("int(69) to Char: ${d.toChar()}" )



}