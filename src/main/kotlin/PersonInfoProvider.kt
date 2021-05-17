
interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printPerson()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String {
        return "parentSession"
    }
}

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionPrefixId = "session"

    override fun getSessionId(): String {
        return sessionPrefixId
    }
}

class DetailInfoProvider: PersonInfoProvider {
    override val providerInfo: String
        get() = "DetailInfoProvider"
}

fun main() {
    var basicInfoProvider = FancyInfoProvider()
    basicInfoProvider.printInfo(Person())
    println(basicInfoProvider.getSessionId())


    var detailInfoProvider = DetailInfoProvider()
    detailInfoProvider.printInfo(Person("Pramod", "Rawate"))

    checkTypes(basicInfoProvider)

    /*Anonymous interclass*/
    var basicInfoProvider2 = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "Annonymous Info Provider"

        fun getSessionId() = "id"
    }
    basicInfoProvider2.printInfo(Person())
    println(basicInfoProvider2.getSessionId())
}

/*Type Checking in Kotlin*/
fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider is SessionInfoProvider) {
        println("is a SessionInfoProvider")
        println((infoProvider as SessionInfoProvider).getSessionId())
    }
    else
        println("not a SessionInfoProvider")
}
