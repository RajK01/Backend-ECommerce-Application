package com.example.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hey {
    @GetMapping("/hey")
    public String heyPage() {
        return "hey"; // This should correspond to hey.html in the templates folder
    }
}
