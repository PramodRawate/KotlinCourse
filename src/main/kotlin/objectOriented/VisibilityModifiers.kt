package objectOriented

class VisibilityModifiers {}

class temp {

    /*Top-Level items are public by default
    * In Kotlin private can be a top-level access modifier which is accessible inside a file.
    * A class marked as private can be used in Kotlin and can be accessed within a file. */

    /* Internal - An accessModifier which tells that it is accessible within a module.
    * A module is a group of files which are compiled together */
    fun main(args: Array<String>) {
        val vm = VisibilityModifiers()
    }
}