package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String hi() {
        return service.sayGreeting();
    }

}
