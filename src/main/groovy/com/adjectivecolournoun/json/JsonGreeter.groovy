package com.adjectivecolournoun.json

import groovy.json.JsonOutput

class JsonGreeter {

    void greet() {
        println JsonOutput.toJson([
                greeting: 'Hello from project'
        ])
    }
}
