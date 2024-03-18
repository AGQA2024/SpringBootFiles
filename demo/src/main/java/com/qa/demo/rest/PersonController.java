package com.qa.demo.rest;

import com.qa.demo.entities.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private List<Person> people = new ArrayList<>();

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.people;
    }

//    public Person createPerson(@RequestBody Person person){
//        return null;
//    }
//
    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person){
        this.people.add(person);
        return this.people.get(this.people.size()-1);
    }

    @DeleteMapping("/remove/{id}")
    public Person removePerson(@PathVariable int id){
        //id acts as the list index
        return this.people.remove(id);
    }

    public Person updatePerson(int id, String name, Integer age, String job){
        return null;
    }
}
