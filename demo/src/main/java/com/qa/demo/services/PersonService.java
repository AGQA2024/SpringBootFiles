package com.qa.demo.services;

import com.qa.demo.entities.Person;
import com.qa.demo.repos.PersonRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepo repo;

    public PersonService(PersonRepo repo){
        this.repo = repo;
    }

//    private final List<Person> people = new ArrayList<>();

//    public List<Person> getAll() {
//        return this.people;
//    }
    public List<Person> getAll() {
        return this.repo.findAll();
    }


//    public Person createPerson(Person person){
//        this.people.add(person);
//        return this.people.get(this.people.size()-1);
//    }

    public Person createPerson(Person person){
        return this.repo.save(person);
    }


//    public Person removePerson(int id){
//        return this.people.remove(id);
//    }

    public Person removePerson(int id){
        Person removed = this.getById(id);
        this.repo.deleteById(id);
        return removed;
    }

//    public Person updatePerson(int id, String name, Integer age, String job){
//
//        Person toUpdate = this.people.get(id);
//
//        if (name != null) toUpdate.setName(name);
//        if (age != null) toUpdate.setAge(age);
//        if (job != null) toUpdate.setJob(job);
//
//        return toUpdate;
//    }

    public Person updatePerson(int id, String name, Integer age, String job){
        Person toUpdate = this.getById(id);

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return this.repo.save(toUpdate);
    }

//    public Person getById(int id){
//        return this.people.get(id);
//    }

    public Person getById(int id){

        return this.repo.findById(id).get();
        //Could have an orElse orElseThrow to handle exceptions
    }
}
