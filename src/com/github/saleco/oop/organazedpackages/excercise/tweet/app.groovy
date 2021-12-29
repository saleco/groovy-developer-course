package com.github.saleco.oop.organazedpackages.excercise.tweet

import java.text.Normalizer


Tweet tweet = new Tweet(post: "This Grooyv Course by @therealdanvega is awesome! #Java #groovylang", username: "@therealdanvega", postDateTime: new Date())
println tweet

tweet.favorite("@ApacheGroovy")
tweet.retweet("@ApacheGroovy")

println tweet.getFavorites()
println tweet.getRetweets()
println tweet.getHashtags()
println tweet.getMentions()

String text = "asdasdã"
println text.normalize()