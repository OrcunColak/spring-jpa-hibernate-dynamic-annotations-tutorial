package com.colak.springtutorial.service;

import com.colak.springtutorial.jpa.Person;
import com.colak.springtutorial.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    @Transactional
    public Person addOrUpdatePerson(Person person) {
        return repository.save(person);
    }
}
