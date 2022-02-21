package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService service;

    public ConstructorInjectedController(GreetingService service) {
        this.service = service;
    }

    public String getGr() {
        return service.sayGreeting();
    }
}
