package com.elevenware.sandbox.sb;

import com.elevenware.sandbox.sb.model.Greeting;
import com.elevenware.sandbox.sb.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    
    @Autowired
    private GreetingService service;


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return service.greet(name);
    }
}
