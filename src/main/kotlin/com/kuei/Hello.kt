package com.kuei

fun main(array: Array<String>){
//    println("Hello kotlin")
//      Human().hello()
    val h = Human()
    var age  = 19
    age = 20
    var weight = 66.5f
    val name : String
    name = "Hank"
    h.hello()
}

class Human {
    fun hello(){
        println("Holle kotlin")
    }
}