package KotlinOOP
import kotlin.reflect.KProperty

class DelegateName {
    //Any untuk tipe data selain string
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animale {
    var name: Any by DelegateName()
}

class Person {
    var name: Any by DelegateName()
}

class Hero {
    var name: Any by DelegateName()
}

fun main() {
    val animal = Animale()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}

