class Person(var firstName: String, var lastName: String) {

    var city: String = "Mumbai"

        get() = field

        set(value) {
            field = value
        }


    init {
        println("init 1")
    }

    constructor(): this("peter", "parker") {
        println("Secondary constructor")
    }

    init {
        println("init 2")
    }

     internal fun printPerson() {
        println("Name of person is $firstName $lastName")
    }
}