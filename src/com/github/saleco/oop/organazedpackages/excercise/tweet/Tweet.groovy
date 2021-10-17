package com.github.saleco.oop.organazedpackages.excercise.tweet

@groovy.transform.Canonical
class Tweet {

    String post
    String username
    Date postDateTime

    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtags = []

    void favorite(String username) {
        favorites << username
    }

    List getFavorites() {
        favorites
    }

    void retweet(String username) {
        retweets << username
    }

    List getRetweets() {
        retweets
    }

    List getMentions() {
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }

    List getHashtags() {
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        post.findAll(pattern)
    }

}
