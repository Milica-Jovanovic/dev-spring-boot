package com.springboot.demo.dev_spring_boot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World!"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private  String coachName;
    @Value("${team.name}")
    private  String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach: " +  coachName + ", Team name:  " + teamName;
    }

    // expose a new endpoint "/workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a har 5k!";
    }

    // expose a new endpoint "/drink"
    @GetMapping("/drink")
    public String getMoreWater() {
        return "Drink more water!";
    }

    // expose a new endpoint "/fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}

/*
    Dev tools for automating reloading:
    IntelliJ IDEA -> Settings -> Build, Execution, Deployment -> Compiler -> check "Build project automatically"
    IntelliJ IDEA -> Settings -> Advanced settings -> check "Allow auto-make to start even if developed application is currently running"

 */