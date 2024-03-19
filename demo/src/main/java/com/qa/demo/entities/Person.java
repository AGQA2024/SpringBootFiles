package com.qa.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "full_name", nullable = false, unique = true)
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job){
        setName(name);
        setAge(age);
        setJob(job);
    }

    public Person(int id, String name, int age, String job){
        setId(id);
        setName(name);
        setAge(age);
        setJob(job);
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }
}

