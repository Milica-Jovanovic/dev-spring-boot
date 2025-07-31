package com.springboot.demo.dev_spring_boot.rest;

import com.springboot.demo.dev_spring_boot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController_SetterInjection {

    // define a private field for the dependency
    private Coach myCoach;

    // define a setter method for dependency injection
    @Autowired
    public void tryAnyName(Coach theCoach) {
        myCoach = theCoach;
    }
    /*public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }*/

    @GetMapping("/dailyworkout2")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
