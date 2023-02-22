package KotlinOOP

class Animal ( val name :String, val age : Int, val isMamal : Boolean){
    fun eat(){
        println("$name sedang makan")
    }

    fun walk(){
        println("$name sedang berjalan")
    }
}

fun main() {
    val result = Animal("Ayam",2,true)
    println("Nama = ${result.name} Umur = ${result.age} isMamal = ${result.isMamal}")
    result.eat()
    result.walk()
}