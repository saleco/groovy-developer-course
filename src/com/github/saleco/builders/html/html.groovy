package com.github.saleco.builders.html

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/about.html')
MarkupBuilder builder = new MarkupBuilder(writer)

List courses = [
        [id: 1, name: 'Groovy'],
        [id: 2, name: 'Java']
]
builder.html {
    head {
        title 'About the page'
        description 'This is an about page'
    }
    body {
        h1 'Header'
        p 'This is some text'
        section {
            h2 'Courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
                courses.each { course ->
                    tr {
                        td course.id
                        td course.name
                    }
                }
            }
        }
    }
}

