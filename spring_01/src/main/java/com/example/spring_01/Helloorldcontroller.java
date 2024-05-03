package com.example.spring_01;
import org.springframework.web.bind.annotation.*;

@RestController
public class Helloorldcontroller {
    @GetMapping(value ="hello")
    public String getMethodName(){
        return "Hello World";
    }    
    
}
