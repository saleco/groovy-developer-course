package com.github.saleco.oop.organazedpackages.beans

Employee emp = new Employee(first: "Dan", last: "Vega", email: "danvega@gmail.com")
println emp

Employee emp2 = new Employee()
emp2.first = "Dan" //calls setter
println emp2.first // calls getter

DoubleBean db = new DoubleBean()
db.value = 100
println db.value //calls getter
println db.@value //direct property access
