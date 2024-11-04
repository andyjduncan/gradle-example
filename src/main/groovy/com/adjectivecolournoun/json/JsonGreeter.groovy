package com.adjectivecolournoun.json

import groovy.json.JsonOutput

class JsonGreeter {

    void greet() {
        println JsonOutput.toJson([
                greeting: 'Hello from project'
        ])
    }
}

public class HardcodedPasswordExample {
    public void authenticate() {
        String password = "hardcodedPassword123"; // Vulnerable line
        if (password.equals("expectedPassword")) {
            System.out.println("Authenticated!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
