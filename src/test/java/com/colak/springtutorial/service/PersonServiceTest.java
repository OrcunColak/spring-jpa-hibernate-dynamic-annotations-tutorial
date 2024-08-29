package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    void addOrUpdatePerson() {

        Person john = new Person(null, "John", 48);
        Person savedPerson = personService.addOrUpdatePerson(john);

        // Because of @DynamicUpdate instead of
        // "update persons set age=?, name=? where id=?"
        // we are getting
        // "update persons set age=? where id=?"
        savedPerson.setAge(50);
        savedPerson = personService.addOrUpdatePerson(john);

        assertEquals(50, savedPerson.getAge());

    }
}