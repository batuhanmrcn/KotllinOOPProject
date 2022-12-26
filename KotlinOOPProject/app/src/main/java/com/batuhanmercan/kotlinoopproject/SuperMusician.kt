package com.batuhanmercan.kotlinoopproject

class SuperMusician(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {

    fun sing(){
        println("nothing else matters")
    }

}