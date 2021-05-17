fun main(args: Array<String>) {

    println("""Null References in kotlin
        |There are 3 types as follows:
        |a. ?(Safe Operator)     b. ?:(Safe operator with default value)    c. !!NotNull Assertion
        |------------------------------------------------------------------------------------------------
        |1. ?(Safe Operator) -  Allows null values. Returns null as value instead of Null Pointer Exception
        |2. ?:(Safe operator with default value) - Default value for a Nullable string
        |3. !1(Not Null assertion) - When we are sure value cant be null or when exception is needed to be thrown if value is NULL
    """.trimMargin())

    var str: String? = null
    // println(str.toUpperCase())  /*Cannot Work*/
    println(str?.toUpperCase())

    println("-------------------Default value of a nullabel string using ?: ----------------")
    //str="abcd"
    val str2 = str?: "This is the default value of str"
    println(str2)

    println("----------------------Smart casting using ?------------------")
    val arr: Any = arrayOf(11, 22,34)
    val str3 = arr as? String
    println(str3)

    println("------------------Not Null assertion using !! operator------------------------")
    val str4: String? = "This is the default not null value for str4"
    val str5 = str4?.toUpperCase()
    println(str5)
    //OR
    //val str6: String? = null
    val str6: String? = "assign null value to check below one"
    val str7 = str6!!.toUpperCase()         /* not null assertion (!!) is used when we are sure value cannot be null or if in case we wont Null Pointer Exception instead of Null value */
    println(str7)

    println("-----------------Let in kotlin-------------------------")
    val str8: String? = null
    myFunc(str8?:"This is default magic")
    // OR - Make use of kotlin let function
    val str9: String? = "This is new magic without let"
    str9?.let { myFunc(it) }

    println("-----------------Let in kotlin-------------------------")
    val str10: String? = null
    val str11 = "This is non null string"
    println(str10 == str11)

    println("-----------------Arrays of Nulls-------------------------")
    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts)
        println(i)
    println(nullableInts[3].toString() )

    println("---------------------Question - 3---------------------------------")
    val arr3 = shortArrayOf(1, 2, 3, 4, 5)
    val arr4: Array<Short>  = arrayOf(1, 2, 3, 4, 6)

    println("---------------------Question - 4---------------------------------")
    val nullableInts2 = Array<Int>(40) { i -> (i+1)*5}
    for (i in nullableInts2)
        println(i)

    println("---------------------Question - 5---------------------------------")
    val arrJ = charArrayOf('a', 'b', 'c')
    //ArraysInJava.myFunc2(arrJ)


    println("---------------------Question - 6---------------------------------")
    val x: String? = "I AM IN UPPERCASE"
    val lowerStr = x?.toLowerCase()?:"I give up"
    println(lowerStr)

    println("---------------------Question - 7---------------------------------")
    println(x?.let { it -> it.toLowerCase().replace("am", "am not") })

    println("---------------------Question - 7---------------------------------")
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}



fun myFunc(text: String) {
    println(text)
}