package com.ex.fizzbuzz.fizzbuzz_ex.rest;

import com.ex.fizzbuzz.fizzbuzz_ex.entities.Number;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NumberControllerMvcTest {

    // TODO Do we need the following code by default?
//    @Autowired
//    private MockMvc mvc;

    Number exNum = new Number();
    @Test
    void testNumber(){
        assertEquals(exNum.FBNumber(5), "Fizz");
    }
}

