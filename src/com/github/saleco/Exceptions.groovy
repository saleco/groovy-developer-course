package com.github.saleco

//no need of throws (checked exceptions)
def foo() {
    throw new Exception("Foo Exception")
}

List log = []

try {
    foo()
} catch(Exception e) {
    log << e.message
} finally {
    log << "finally"
}

println log

//multi catch syntax
try {

} catch (FileNotFoundException | NullPointerException e) {
    println e.class.name
    println e.message
}