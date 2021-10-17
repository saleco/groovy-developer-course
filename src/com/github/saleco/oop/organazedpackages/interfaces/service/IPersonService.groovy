package com.github.saleco.oop.organazedpackages.interfaces.service

import com.github.saleco.oop.organazedpackages.interfaces.domain.Person

interface IPersonService {

    Person find()
    List<Person> findAll()
}