package com.github.saleco.builders.html

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('exercise.html')
MarkupBuilder builder = new MarkupBuilder(writer)

builder.html {
    head {
        title 'Books List'
    }
    body {
        h1 'Books'
        table {
            tr {
                th 'title'
                th 'author'
                th 'price'
            }
            tr {
                td 'Groovy in Action 2nd Edition'
                td 'Dierk Koenig'
                td 50.58
            }
            tr {
                td 'Making Java Groovy'
                td 'Ken Kousen'
                td 33.96
            }
            tr {
                td 'Programming Groovy 2: Dynamic Productivity for the Java Developer'
                td 'Venkat Subramaniam'
                td 28.92
            }
        }
    }
}


