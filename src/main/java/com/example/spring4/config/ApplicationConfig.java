package com.example.spring4.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Here we will put all generic spring configuration.
 * When run, this class will use spring-boot with default configuration.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.example.spring4.config")
public class ApplicationConfig {
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }
}
