package com.github.saleco.rest.json

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {
    currentBook {
        title 'The 4 Hour Work Week'
        isbn '978-0-307-46535-1'
        author( first: 'Timothy', last: 'Ferris', twitter: '@tferriss')
        related 'The 4 Hour Body', 'The 4 hour chef'
    }

    nextBook {
        title '#AskGaryVee'
        isbn '978-0-302-46512-1'
        author( first: 'Gary', last: 'Doe', twitter: '@garydoe')
        related 'Jab Jab Jab, Right Hook', 'Crush it!'
    }
}

new File('../../../../../data/books.json').write(builder.toPrettyString())

