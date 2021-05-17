class FancyInfoProvider: BasicInfoProvider() {
    override val providerInfo: String
        get() = "Fancy Info Provider"

    override val sessionPrefixId: String
        get() = "Fancy Session Id"


    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy printInfo()")
    }
}