package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService service;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGr() {
        return service.sayGreeting();
    }
}
