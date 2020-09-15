package com.oeyr.kacyakar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping
    public List<String> test(){
        return Arrays.asList("a","b","c");
    }
}
