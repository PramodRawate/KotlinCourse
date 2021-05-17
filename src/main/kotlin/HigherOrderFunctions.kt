fun printFilter(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach{
        if(predicate(it))
            println(it)
    }
}

fun main() {
    val names = listOf("Pramod", "Rohit", "Pradeep", "Manda")
    printFilter(names, { it.startsWith("P")})
}