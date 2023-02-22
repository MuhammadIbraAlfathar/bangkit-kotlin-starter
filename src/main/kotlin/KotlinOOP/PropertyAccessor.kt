package KotlinOOP

//class Animals{
//    var name: String = "Dicoding Miaw"
//}
//
//fun main(){
//    val dicodingCat = Animals()
//    println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//}

/*
output:
Nama: Dicoding Miaw
Nama: Goose
*/

/* Melakukan override pada fungsi getter dan setter */

class Animals{
    var name = "Miaww"

    get() {
        println("Fungsi getter terpanggil")
        return field
    }

    set(value) {
        println("Fungsi setter terpanggil")
        field = value
    }
}

fun main() {
    val dicoding = Animals()
    println("Nama ${dicoding.name}")
    dicoding.name = "Gooses"
    println("Nama ${dicoding.name}")
}

