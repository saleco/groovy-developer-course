package com.github.saleco.oop.classes.fields.variables

class Person {

    //private is the default accessor and getter and setter will automatically generated
    //if private accessor is defined explicitly, there will be no getters and setters
    String firstName, lastName


    def dateOfBirth //no type assigned

    protected String f1,f2,f3

    private Date createdOn = new Date()

    static welcomeMessage = "HELLO"

    public static final String WELCOME_MSG = "HEY HEY"

    //local variables
    def foo() {
        String msg = "Hello"
        String firstName = "Dan"
        println "$msg, $firstName"
    }
}

println Person.welcomeMessage
println Person.WELCOME_MSG

def person = new Person()
println person.foo()
