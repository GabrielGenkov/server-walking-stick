package com.example.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping(value = "/")
    public String mainPage(@RequestParam(name="name", required = false, defaultValue = "gtryp") String name){
        return name;
    }
}
