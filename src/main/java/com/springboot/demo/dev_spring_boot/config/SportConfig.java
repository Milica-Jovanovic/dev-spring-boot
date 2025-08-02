package com.springboot.demo.dev_spring_boot.config;

import com.springboot.demo.dev_spring_boot.common.Coach;
import com.springboot.demo.dev_spring_boot.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }

}
