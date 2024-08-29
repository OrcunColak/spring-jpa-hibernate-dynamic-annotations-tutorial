package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
