package com.adjectivecolournoun.gradle


import com.adjectivecolournoun.jar.SimpleGreeter
import com.adjectivecolournoun.json.JsonGreeter
import com.codevineyard.helloworld.App

class Greetz {

    static void main(String... args) {
        new SimpleGreeter().greet()
        new JsonGreeter().greet()
        println new App().message
    }
}
