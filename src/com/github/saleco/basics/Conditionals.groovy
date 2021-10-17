package com.github.saleco.basics

// CONDITIONAL STRUCTURES

//if
if (true) {
    println "true"
}

if (true)
    println "true"

def age = 35
if(age >= 35) {
    println "can run for president"
}

if( false ) {
    println "true"
} else {
    println "false"
}

def yourage = 18
if(yourage  >= 21) {
    println "buy beer"
} else {
    println "no beer"
}

if( false ) {
    println "a"
} else if (false) {
    println "b"
} else {
    println "c"
}

//ternary operator
def name = "Dan"
def isitdan = (name.toUpperCase() == "DAN") ? "YES" : "NO"
println isitdan

//elvis operator :?
def msg
def output = (msg != null) ? msg : "default message...."

def elvisOutput = msg ?: "default message"
println msg
println output
println elvisOutput

//switch statement (many different ways to use it!)
def num = 12

switch (num) {
    case 1 :
        println "1"
        break
    case 2:
        println "2"
        break
    case 1..3 :
        println "in range 1..3"
        break
    case [1, 2, 12]:
        println "value is in list [1,2,12]"
        break
    case Integer :
        println "num is an integer"
        break
    case Float :
        println "num is a float"
        break
    default:
        println "default"
}

//in
def validAges = 18..35
def validPrices = [13, 15, 19]
def someValue = 19
println someValue in validAges
println someValue in validPrices