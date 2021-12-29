package com.github.saleco.rest.xml

def xml = '''
    <sports>
        <sport>
            <name>Football</name>
        </sport>
    </sports>
'''

def sports = new XmlSlurper().parseText(xml)
println sports.getClass().getName()
println sports.sport.name

def sportsFromFile = new XmlSlurper().parse('../../../../../data/sports.xml')
println sportsFromFile

println sportsFromFile.sport[1].name
