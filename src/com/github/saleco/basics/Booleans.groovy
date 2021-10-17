package com.github.saleco.basics

/*
    Boolean -> Boolean value is true
    Matcher -> Matcher has Match
    Collection -> Collection is non empty
    Map -> Map is non empty
    String -> String in non empty
    Number, Character -> Number is non zero
    None of the above -> Object reference is non null
 */

assert(true)
assert(!false)

assert ('a' =~ /a/)
assert !('a' =~ /b/)

assert [1]
assert ![]

assert [a:"a"]
assert ![:]

assert "a"
assert !""

assert 1
assert -1
assert !0

assert new Object()
assert !null