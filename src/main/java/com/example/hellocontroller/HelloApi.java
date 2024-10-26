package com.example.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {
    // This endpoint returns an object of ReturnObject in JSON format
    @RequestMapping("/return")
    public ReturnObject aboutReturnObject() {
        // Return an instance of the ReturnObject
        return new ReturnObject("Rajeev", 25); // Replace with any name/age as needed
    }
}