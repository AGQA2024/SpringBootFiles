package com.qa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Projects {

    @GetMapping("/projects/{id}")
    public String index(@PathVariable int id){
        return "Project ID:" + id;
    }
}
