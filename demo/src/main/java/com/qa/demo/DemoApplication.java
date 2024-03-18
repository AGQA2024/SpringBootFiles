package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

//	@GetMapping("/hello")
//	public String greeting(){
//		return "Hello, World!";
//	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

//	@GetMapping("/action")	//This makes the following accessible to our webserver?
//	public String Action(){
//		return "THIS IS AN <h2>ACTION</h2>";
//	}

	@GetMapping("/action/{number}")	//This makes the following accessible to our webserver?
	public String Action(@PathVariable int number){
		return "THIS IS AN <h2>ACTION "+(number*2)+" </h2>";
	}

//
//	@GetMapping("/action/{number}")	//This makes the following accessible to our webserver?
//	public String Action(@PathVariable int number){
//		return "THIS IS AN <h2>ACTION "+(number*2)+" </h2>";
//	}

}
