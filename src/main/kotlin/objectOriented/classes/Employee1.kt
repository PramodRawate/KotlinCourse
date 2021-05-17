package objectOriented.classes

/* In kotlin all classes are Public and Final by default*/

/* 1. Primary Constructor with init block*/
class Employee1 constructor(firstName: String) {
    val firstName: String

    /* Below code is for assignment and works in conjunction with Primary constructor.
    * This can be joined together with declaration as shown above*/
    init {
        this.firstName = firstName
    }
}

/* 2. Primary Constructor without init block.
* Declaration and assigment block together*/
class Employee2 constructor(firstName: String) {
    val firstName: String = firstName
}

/* 3. Primary Constructor - Assign parameter values to property values in primary constructor.
* Kotlin by default creates parameter with name as property name and assigns parameter value to property.
* Also 'constructor' keyword can also be removed.*/
class Employee3(val firstName: String) {
}

/* 4. Secondary Constructor - Assign parameter values to property values in primary constructor.
* Secondary constructor does not allow 'val'. Secondary constructor should call primary constructor using 'this()'. */
class Employee4(val firstName: String) {
    var fullTime: Boolean = true
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}


/* 5. Modified Primary Constructor instead of Secondary Constructor.
* Assign a default value to 'fullTime' in primary constructor and eliminate secondary constructor*/
class Employee5(val firstName: String, var fullTime: Boolean = true) {}


/* 6. Secondary constructor without primary constructor*/
class Demo {
    val name: String
    constructor(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val employee1 = Employee1("Pramod")
    val employee2 = Employee2("Rohit")
    val employee3 = Employee3("Pradeep")
    val employee4 = Employee4("Mandakini", false)
    val employee5 = Employee5("Sadashiv", false)
    println(employee1.firstName)
    println(employee2.firstName)
    println(employee3.firstName)
    println("${employee4.firstName}\t${employee4.fullTime}")
    println("${employee5.firstName}\t${employee5.fullTime}")

    val demo = Demo("Pramod")
    println(demo.name)
}