package com.github.saleco.oop.organazedpackages.traits

trait FlyingAbility {

    public String a
    private String b

    //can be overrided
    String fly() {
        "I'm flying"
    }

    //must be implemented
    abstract String foo()

    //private methods
    private String bar() {

    }

}