package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService service;

    public String getGr() {
        return service.sayGreeting();
    }
}
