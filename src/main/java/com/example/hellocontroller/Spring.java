package com.example.hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This ensures that the return value is treated as a response body, not a view name
public class Spring {
    @GetMapping("/spring")
    public String aboutSpring() {
        return "Welcome to Spring Boot Application!";
    }
}
