package com.github.saleco.builders.xml

import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true

def sports = builder.sports {
    sport(id: 1) {
        name 'Baseball'
    }
    sport(id: 2) {
        name 'Basketball'
    }
    sport(id: null) {
        name ''
    }
}


