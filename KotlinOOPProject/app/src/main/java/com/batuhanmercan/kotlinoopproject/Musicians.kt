package com.batuhanmercan.kotlinoopproject

open class Musicians(name: String, instrument: String, age: Int) {
//encapsulation


    var name : String? = name
        private set
        get


   private var instrument : String? = instrument


       var age : Int? = age
            private set
            get

}