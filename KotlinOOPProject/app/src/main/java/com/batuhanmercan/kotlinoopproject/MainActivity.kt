package com.batuhanmercan.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//constructor
        var myUser = User("Batuhan",22)
        myUser.name = "Mercan"
        myUser.age = 23

        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())




    //encapsulation
        var james = Musicians("James","Guitar",55)
        println(james.age)

        //inheritance

        var lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        lars.sing()

        //polymorphism
        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())

        //dynamic polymorphism
        val animal = Animal()
        animal.sing()
        val barley = Dog()
        barley.test()
        barley.sing()

     //abstract & interface

    //var myPeople = People()

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        println(myPiano.roomName)

        //Lambda expressions
        fun printString(myString : String){
            println(myString)

        }

        printString("My Test String")

        val testString = {myString : String -> println(myString)}
        testString("My Lambda String")

        //asynchrnous

        //callback function, listener function, completion function

        fun downloadMusicians(url : String ,  completion : ()  -> Unit) {
        //url -> download
            //data

            completion()


        }


        downloadMusicians("metallica.com",{
            println("completed && ready")
        })

    }

}