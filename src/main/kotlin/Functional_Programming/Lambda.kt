package Functional_Programming

fun main() {
    val helloName = lambda(null)
    println(helloName)
}

val lambda =  {
    name : String? -> if (name == null) "Hello Bro" else "Hello $name"
}