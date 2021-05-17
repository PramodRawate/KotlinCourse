class Entity constructor(val id: String) {

    companion object Factory{
        fun create() = Entity("1")
    }
}

enum class EntityFactory

fun main() {
    val entity = Entity.create()
}