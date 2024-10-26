package com.example.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String helloPage() {
        // This method returns the name of the view (HTML page) to be rendered
        return "hello"; // This corresponds to hello.html in the templates folder
    }
}
