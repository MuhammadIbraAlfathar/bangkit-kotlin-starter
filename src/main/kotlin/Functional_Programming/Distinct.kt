package Functional_Programming

fun main() {
    data class Item (val key : String, val value : String)

    val items = listOf(
        Item("1","Kotlin"),
        Item("2","Java"),
        Item("3","Java"),
        Item("2","Javascript")
    )

    val distinctItems = items.distinctBy { it.value}
    distinctItems.forEach{
        println("${it.key} + ${it.value}")
    }


}