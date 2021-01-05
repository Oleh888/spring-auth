package com.example.springauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello everyone!";
    }
}
