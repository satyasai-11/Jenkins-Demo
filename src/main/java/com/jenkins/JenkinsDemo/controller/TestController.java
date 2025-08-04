package com.jenkins.JenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "test")
    public String test(){
        return "Hi Guest !  Jenkins Testing";
    }
    @GetMapping("friends")
    public String friends(){
        return "My Friends";
    }
}
