package com.github.saleco.rest.get

import groovy.json.JsonSlurper
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

@Grab(group = "org.codehaus.groovy.modules.http-builder", module = "http-builder", version = "0.7.1")

String base = "http://www.7timer.info"

def chuck = new RESTClient(base)
def params = [on:"113.17", lat: "23.09", product: "astro", output: "json"]

JsonSlurper jsonSlurper = new JsonSlurper()


chuck.get(path: '/bin/api.pl', query: params) {
    response, json ->
        println response.status
        println jsonSlurper.parse(json)
}
