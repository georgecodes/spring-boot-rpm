package com.elevenware.sandbox.sb.services;

import com.elevenware.sandbox.sb.model.Greeting;
import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
    
    Greeting greet(String name);
}
