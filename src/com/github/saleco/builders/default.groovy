package com.github.saleco.builders

Developer sallo = Developer.builder()
    .firstName("Sallo")
    .lastName("Szrajbman")
    .email("salloszraj@gmail.com")
    .hireDate(new Date())
    .middleInitial("Dr")
    .languages(["Java", "Groovy"])
    .build()

println sallo
assert sallo.firstName == "Sallo"
assert sallo.languages.size() == 2

