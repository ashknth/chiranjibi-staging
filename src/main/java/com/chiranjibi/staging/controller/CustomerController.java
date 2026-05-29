package com.chiranjibi.staging.controller;

import com.chiranjibi.staging.dto.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @GetMapping("/customer")
    public Person customer() {
        return new Person(1L, "John", "Doe", "john.doe@example.com", 30);
    }
}

