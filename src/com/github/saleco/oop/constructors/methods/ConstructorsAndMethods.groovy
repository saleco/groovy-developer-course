package com.github.saleco.oop.constructors.methods

import groovy.transform.ToString

@ToString
class Person {

    String first,last

    //custom constructor
    Person(String fullName) {
        List parts = fullName.split(" ")
        first = parts[0]
        last = parts[1]
    }

    //methods
    String getFullName() {
        "$first $last"
    }

    //can return any type
    def bar() {

    }

    static String doGoodWork() {
        println "doing good work"
    }

    //no need to assign type to parameter or assign def or assign a type
    def someMethod(numbers) {

    }

    //typed return and parameter
    List someMethod2(List numbers) {

    }

    //default values
    List someMethod3(List numbers = [1,2,3], Boolean canAccessAll = false) {

    }

    def concat(String... args) {
        args.join("")
    }
}

//Person p1 = new Person(first: "Dan", last: "Vega")
//println p1

Person p2 = new Person("Dan Vega")
println p2

Person.doGoodWork()

