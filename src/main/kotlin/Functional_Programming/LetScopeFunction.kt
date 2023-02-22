package Functional_Programming

fun main() {
    val message : String? = null
    val result = message?.let {
        val length = it.length*2
        "length text $length"
    } ?: run {
        "Message is null"
    }

    println(result)
}