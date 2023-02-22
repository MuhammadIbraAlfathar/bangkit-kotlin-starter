package DataClassesDanCollection

fun main() {
    val dataUser = dataUser("Joko",20)
    val (name,age) = dataUser
    println("My name is $name and my age $age")
}

data class dataUser(val name: String, val age: Int){
    //fun Intro() :String = "My name is $name and my age $age"
}
