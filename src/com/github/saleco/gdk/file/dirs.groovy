package com.github.saleco.gdk.file

String dir = "D:\\projetos\\groovy-trainning\\HelloWorld"
List hidden = []
new File(dir).eachFile {file ->
    if(file.isDirectory()) {
        println file.name
    }

    if(file.isHidden()) {
        hidden << file.name
    }
}
println "\n\n------list all hidden files in a directory------"
println hidden

println "\n\n------list all subfolders in a directory------"
new File(dir).eachDir {subfolder ->
    println subfolder
}

println "\n\n------directory size------"
println new File(dir).directorySize()

println "\n\n------create new directory and sub-directories ------"
new File("dummy").mkdir()
new File("one/two/three").mkdirs()

println "\n\n------delete directory------"
new File("dummy").deleteDir()
new File("one").deleteDir()

