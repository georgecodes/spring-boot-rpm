package com.elevenware.sandbox.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@EnableAutoConfiguration
@Configuration
public class Boot {
    
    public static void main(String[] args) {

        SpringApplication.run(Boot.class, args);
        
    }
    
}
