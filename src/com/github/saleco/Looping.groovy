package com.github.saleco

//Looping

//while
List numbers = [1,2,3]
while(numbers) {
    //do something
    numbers.remove(0)
}

assert numbers == []


//for
List nums = [1,2,3]
for(i in nums) {
    println i
}

for(i in 1..10) {
    println i
}

//return/break/continue

//last line automatically return
String getFoo() {
    "foo"
}

Integer a = 1
while (true) { //infinite loop
    a++
    break
}
assert a == 2

for (String s in "a".."z") {
    if (s == "a") continue
    println s
    if (s > "b") break
}
