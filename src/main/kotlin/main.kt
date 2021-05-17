var name:String? = "Pradeep"
var greeting: String? = "Welcome"

fun main(args: Array<String>) {
    println("Hello World!")

    /*println("-------VAR and VAL-----------")
    varAndVal()*/

    /*println("-------Top leve and local variable declarations--------")
    checkWithTopLevelValues()*/

    /*println("--------Null values in kotlin-------")
    nullValues()*/

    /*println("------If-Else in Kotlin---------")
    //ifelse()*/

    /*println("------When in Kotlin---------")
    whenInKotlin()*/

    /*println("------Calling a function in Kotlin---------")
    var callResponse = callPramod(9552445983)
    println(callResponse)*/

    //println("************Collections in kotlin************")
    /*println("----------Arrays in kotlin----------")
    var c =  CollectionsInKotlin()
    c.executeArrays()*/

    /*println("----------Lists in kotlin----------")
    var c2 =  CollectionsInKotlin()
    c2.executeLists()*/

    /*println("----------Maps in kotlin----------")
    var c3 =  CollectionsInKotlin()
    c3.executeMaps()*/

    /*println("----------Passing Collections as arguments to functions kotlin----------")
    var c4 = CollectionsInKotlin()
    var names = listOf("Pradeep", "Pramod", "Rohit")
    c4.collectionArguments(greeting, names)*/

    /*println("----------Variable arguments(varargs) in kotlin Functions----------")
    var c5 = CollectionsInKotlin()
    c5.variableArguements(greeting, "Pramod")
    c5.variableArguements(greeting, "Pramod", "Payal", "Pranav")*/

    /*println("----------Passing existing array/arraylist to varargs in kotlin----------")
    val c6 = CollectionsInKotlin()
    var names = arrayOf("Pradeep", "Pramod", "Rohit")
    c6.colletionToVarargs(greeting, *names)*/

    /*println("------------Named parameters to a function in kotlin")
    val c7 = CollectionsInKotlin()
    c7.namedParameters(name = "Pramod", greeting = "Welcome")*/

    /*println("------------Named parameters to a function in kotlin")
    val c8 = CollectionsInKotlin()
    c8.defaultValuesToFunctionParameters()*/

    println("********************************************************")
    println("*********************Classes in Kotlin **************")
    var person = Person()
    person.firstName = "ajay"
    person.lastName
    person.printPerson()
    var person2 = Person()
    person2.printPerson()

    person2.city = "Rajgad"
    println(person.city)

}

fun whenInKotlin() {
    var name1: String? = null
    when(name1)
    {
        "Raj" -> println("Hi, Im Raj")
         null -> println("I love sports")
    }

    greeting  = null
    val greetingToPrint = when(greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}

fun ifelse() {
    var value = 9
    greeting = "Welcome"
    if(value < 10)  println("You are IN") else println("You are OUT")

    greeting = null
    if(value < 10)  println("You are IN") else println("You are OUT")

    var greetingToPrint = if (greeting!=null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}

fun nullValues() {
    name = "Pradeep"

    println("Name is $name")
    println(name is String)

    greeting = null
    println(greeting)
    println(name)
}

fun checkWithTopLevelValues() {
    var name = "Rohit"
    println(name)
    println("Name is ${name}")
}

fun varAndVal() {
    var name = "Pramod"
    println(name)
    name  = 105.toString()
    println(name is String)

    val surname = "Rawate"
    println(surname)
    //surname = "Patil"             /*Val type cannot be reassigned*/
}


/* Declaring a function in kotlin*/
fun callPramod(number: Long?) = if (number!=null) "Calling Pramod on $number" else "Not a valid number"
