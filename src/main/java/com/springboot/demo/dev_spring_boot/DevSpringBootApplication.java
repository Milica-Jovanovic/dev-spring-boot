package com.springboot.demo.dev_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* // including packages we want to scan
	@SpringBootApplication(
		scanBasePackages = {
				"com.springboot.demo.dev_spring_boot",
				"com.springboot.demo.util"
		}
)*/
@SpringBootApplication
public class DevSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSpringBootApplication.class, args);
	}

}

/*

	Behind the @SpringBootApplication annotation and its import are the following annotations:
		@EnableAutoConfiguration
		@ComponentScan
		@Configuration

	Behind the SpringApplication import are the following actions:
	   register all beans
	   start the embedd]ed server Tomcat
	   ...

 */