package com.github.saleco.gdk.file

println "------create a file------"
def file = new File("dummy.txt")
file.write("This is some text\n")

file.append("I am some more text...")

List lines = file.readLines()
lines.each {line -> println line}

println "\n\n------list all files in a directory------"
String dir = "D:\\projetos\\groovy-trainning\\HelloWorld\\src\\com\\github\\saleco\\gdk\\file"

new File(dir).eachFile {eachFile ->
    if(eachFile.isFile()) {
        println eachFile.name
    }
}

println "\n\n------list all files in a directory and sub-directories------"
String dir2 = "D:\\projetos\\groovy-trainning\\HelloWorld\\src\\com\\github\\saleco"
new File(dir2).eachFileRecurse {eachFile ->
    if(eachFile.isFile()) {
        println eachFile.name
    }
}

println "\n\n------list all files that ends with .groovy in a directory------"
new File(".").eachFile {currentFile ->
    if(currentFile.name.endsWith(".groovy") ) {
        println currentFile.name
    }
}


