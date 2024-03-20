package com.ex.fizzbuzz.fizzbuzz_ex.entities;

public class Number {

    // TODO Add in numbers table here to practice using @Entity, @Id, @GeneratedValue, @Column

    public String FBNumber(){
        return "Fizz";
    }

    public String FBNumber(int n){
        if(n % 3 ==0){
            return "Fizz";
        }
        else if(n % 5 ==0){
            return "Buzz";
        }
        else {
            return n;
        }
    }

}
