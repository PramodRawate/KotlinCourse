fun main(args: Array<String>) {
    var a = arrayOf(10, 20, 30, 40, 50)
    println("Type of array a: ${a is Any}")
    println("Type of array a: ${a is Array<Int>}")

    println("------------------------------------------")
    var b = arrayOf("Pramod", "Rawate", 30, 40L, 50)
    println("Type of array b: ${a is Any}")
    println("Type of array b: ${a is Array<Int>}")

    println("------------------------------------------")
    var aa = intArrayOf(69, 105, 75, 89)
    for (c in aa)
        println(c.toChar())

    println("------------------------------------------")
    var chars = charArrayOf('A', 'B')
    for (c in chars)
        println(c.toInt())

    println("------------------------------------------")
    var intArray: Array<Int>
    intArray = arrayOf(10, 20)
    for (ia in intArray)
        println(ia)

    println("------------------------------------------")
    var intArrayInKotlin: Array<Int> = aa.toTypedArray()
    for (i in intArrayInKotlin)
        println(i)
}