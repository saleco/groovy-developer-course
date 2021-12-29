package com.github.saleco.basics

import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import java.security.cert.CertificateException
import java.security.cert.X509Certificate


def c = {}
println c.class.name

def sayHello = { name ->
    println "Hello, $name"
}

sayHello("Sallo")

List nums = [1, 2, 3, 4, 5, 6]
nums.each {println it}

//clousure as the last argument
def timesTen(num, clousure) {
    clousure(num*10)
}

timesTen(10, {println it})

//since closure is the last arg we can do it like this (can be out of the params list)
timesTen(10) { println it}

10.times {println it}

Random rand = new Random()
3.times {println rand.nextInt()}


//closures parameters

//implicit param
def foo = {
    println it
}

foo("dan")

//enforce no params
def noparams = { ->
    println "I have no params"
}

def sayHello2 = { String first, String last ->
    println "Hello, $first $last"
}

sayHello2("Sallo", "Szrajbman")

//default values
def greet = {String name, String greeting = "Howdi" ->
    println "$greeting $name"
}

greet("Sallo", "Hello")
greet("Sallo")

//varags
def concat = { String... args ->
    args.join('')
}

println concat("a", "b", "c")

//closure properties can be use for dynamicly handle by parameter types for example
def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = {int x, int y -> x+y}

someMethod (someClosure)



//collection methods
List favNums = [2, 21, 34, 45, 9]
favNums.each {println it}

//each with index
favNums.eachWithIndex { int entry, int i -> println "index $i is $entry" }

//find
List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"]
println days.findAll {it.startsWith("S")}

//collect
List nums2 = [1, 3, 65, 3]
List numsTimesTen = []
nums2.each {numsTimesTen << it*10 }
println numsTimesTen

//using collect
List newTimesTen = nums2.collect {it*10}
println newTimesTen

//curry methods
def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug statement")

//creating now a debugLog to handle the commons values and override log closure
def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statement")

//yet another one with type and date
def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("Yet another debug statement")

//right curry
def crazyPersonLog = log.rcurry("Why am I loggin this way?")
crazyPersonLog("DEBUG", new Date())

//index based curry
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("DEBUG", "This is using ncurry")

/*Closure Scopes
 Owner, delegate, this
 this -> corresponds to the enclosing class where the closure is defined
 owner -> corresponds to the enclosing object where the closure is defined , which may be either a class or a closure
 delegate -> corresponds to a third party object where methods calls or properties are resolved whenever the receive of the message is not defined
 */

class ScopeDemo {

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name

        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()


//how to select delegate
def writer = {
    append 'Dan'
    append ' lives in Cleveland'
}

def append(String s) {
    println "append() called with argument $s"
}

//delegating append method from StringBuffer
//in case we have the same method defined, the owner takes priority unleess we set the closure resolving strategy
StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
println writer()


/*
Using closures exercise
 */
def closureMethod(Closure c) {
    println c(10)
}

def closure = { it / 2 }

closureMethod(closure)

//list
List myList = ["a", "d", "j"]
myList.each {println it}

//maps
Map myMap = [name: "Sallo", lastName: "Szrajbman"]
myMap.each {key, value -> println "[$key]:[$value]"}

//curry method
def hasRole = { String role, List myRoles ->
    !myRoles.findAll { (it == role) }.isEmpty()
}

println hasRole("admin", ['admin', 'developer'])

def isAdmin = hasRole.curry("admin")

println isAdmin(['admin', 'developer'])
println isAdmin(['developer'])

//find, findAll, any, every, groupBy
List people = [
        [name: "Sallo", city: "Lisbon"],
        [name: "Pedro", city: "Lisbon"],
        [name: "Julien", city: "Lausanne"],
        [name: "Seb", city: "Lausanne"],
        [name: "Daniel", city: "Rio de Janeiro"]
]

//finds first
println people.find {  person -> person.city == "Lisbon"}

//finds all
println people.findAll { person -> person.city == "Lisbon"}

//returns a boolean when finding any result
println people.any {person -> person.city == "Lisbon"}

//returns a boolean when finiding all the results with the expression
println people.every {person -> person.city == "Lisbon"}

//group by property
println people.groupBy {person -> person.city}

println "-------------------------------------- COMBINATIONS -----------------------------"
def nameParts = "Sallo Cohen".split(" ") as List
Set namesToTry = [nameParts, nameParts, nameParts].combinations().findAll { a, b, d -> a != b && a != d && b != d} as Set
Set perm = nameParts.permutations()

nameParts.each {println it}
println namesToTry
println perm





