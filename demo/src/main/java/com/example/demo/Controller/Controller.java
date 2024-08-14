package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/alo-mundo")
    public String aloMundo(){
        return "Alo mundo!";
    }
}
