package KotlinOOP

class Hewan (val name : String, val age : Int, val isMamal : Boolean)

val Hewan.getInfoHewan : String
get() = "Nama Hewan ${this.name} Umur Hewan = ${this.age} isMamal? ${this.isMamal}"

fun main() {
    val printHewan = Hewan("Kucing",2,true)
    println(printHewan.getInfoHewan)
}