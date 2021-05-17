class CollectionsInKotlin {
    fun executeArrays() {
        val hobbies = arrayOf("Trekking", "Football", "Cricket", "Badminton")
        println(hobbies.size)
        println(hobbies.get(3))
        println(hobbies[1])

        for (h in hobbies)
            print("$h \t")

        println("\n")
        hobbies.forEach {
            println(it)
        }

        println("\nForEach loop using 'it'")
        hobbies.forEach { hobby ->
            println(hobby)
        }

        println("\nIndexed ForEach loop")
        hobbies.forEachIndexed { index, hobby ->
            println("$hobby is present at $index")
        }
    }

    fun executeLists() {
        var teams = listOf(125, "Mumbai Indians", "Delhi Capitals", "Kolktata Knight Riders", "Sunrisers Hyderabad", "Chennai Super Kings", "Rajasthan Royals" , "Punjab Kings", "Royal Challengers Banglore")
        println(teams.get(0) is Int)
        println(teams[1])
        teams.forEach {
            println(it)
        }
        println(teams is List<*>)
    }

    fun executeMaps() {
        var winCount = mapOf("MI" to "5", "KKR" to "2" ,"CSK" to "3", "SRH" to "1", "RR" to "1")
        winCount.forEach { team, wins ->
            println("$team has own $wins trophies")
        }

        println("\n")
        var nameAndCities = mutableMapOf("Pramod" to "Pune", "Rohit" to "Mumbai", "Pradeep" to "Chennai", "Manda" to "Varanasi")
        nameAndCities.put("Sadashiv", "Heaven")
        nameAndCities.forEach { name, city ->
            println("$name belongs to $city")
        }
    }

    fun collectionAsArguments(greeting: String, names: List<String>) {
        names.forEach { println("$greeting $it") }
    }

    fun variableArguements(greeting: String, vararg name: String) {
        name.forEach { println("$greeting $it") }
    }

    fun colletionToVarargs(greeting: String? , vararg name: String) {
        name.forEach { it ->
            println("$greeting  Mr.$it")
        }
    }

    fun namedParameters(greeting: String , name: String) = println("$greeting $name")

    fun defaultValuesToFunctionParameters(greeting:String = "Hello" ,name: String = "Rohit") = println("$greeting $name")

}