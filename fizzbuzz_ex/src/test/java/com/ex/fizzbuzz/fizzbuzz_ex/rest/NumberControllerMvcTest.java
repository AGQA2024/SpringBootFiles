package com.ex.fizzbuzz.fizzbuzz_ex.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class NumberControllerMvcTest {

    // TODO Do we need the following code by default?
    @Autowired
    private MockMvc mvc;

    @Test
    void testDivByThree(){

    }
}

