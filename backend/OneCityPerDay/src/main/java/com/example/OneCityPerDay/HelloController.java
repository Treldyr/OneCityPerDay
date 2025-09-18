package com.example.OneCityPerDay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "✅ Hello World depuis Spring Boot et Java 21 !";
    }
}