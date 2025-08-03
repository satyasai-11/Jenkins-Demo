package com.jenkins.JenkinsDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(value = "welcome")
    public String welcome(){
        return "Hello Guest ! Welcome to Jenkins";
    }
}
