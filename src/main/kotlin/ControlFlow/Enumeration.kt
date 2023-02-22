package ControlFlow

//fun main() {
//    val color = Color.RED
//    println(color)
//}
//
//enum class Color(val value : Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}

fun main() {
    val colors = Color.values()
    colors.forEach { color -> println("$color") }
}

enum class Color(val value : Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}