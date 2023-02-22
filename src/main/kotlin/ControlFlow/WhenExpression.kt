package ControlFlow

import kotlin.random.Random

fun main() {
    val num = 10
    val result = when(num){
        8 -> {
            "Value is 8"
            "88888888"
        }

        9 -> {
            "Value is 9"
            "999999999"
        }

        10 -> {
            "Value is 10"
            "1010101010"
        }
        else -> {
            "Errror"
        }


    }
    println(result)

    //Memeriksa nilai di dalam range
    val number = 10
    val range = 1..100

    when(number){
        in range -> println("Number available")
        !in range -> println("Number not detection")
        else -> println("Error")
    }

    val registerNumber = when(val regis = getRandomNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)


}

fun getRandomNumber () = Random.nextInt(100)