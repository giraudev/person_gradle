package com.example.person.service;

import com.example.person.dao.PersonDAO;
import com.example.person.domain.Person;
import com.example.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private PersonRepository personRepository;

    public Object findAll(){
        return personRepository.findAll();
    }

    public Person findById(Long id){
        return personRepository.getOne(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }
}
