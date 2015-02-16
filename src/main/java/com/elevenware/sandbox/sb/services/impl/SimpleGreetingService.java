package com.elevenware.sandbox.sb.services.impl;

import com.elevenware.sandbox.sb.model.Greeting;
import com.elevenware.sandbox.sb.services.GreetingService;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class SimpleGreetingService implements GreetingService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @Override
    public Greeting greet(String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
