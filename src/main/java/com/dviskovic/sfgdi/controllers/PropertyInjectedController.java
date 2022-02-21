package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService service;

    public String getGr() {
        return service.sayGreeting();
    }
}
