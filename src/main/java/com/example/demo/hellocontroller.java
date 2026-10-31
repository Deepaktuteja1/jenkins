package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellocontroller {
    @GetMapping("/")
    public String home() {
        return "Hello DevOps Students! Jenkins CI/CD is working!   ";
    }
}