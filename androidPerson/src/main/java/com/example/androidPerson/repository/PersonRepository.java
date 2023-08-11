package com.example.androidPerson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.androidPerson.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
