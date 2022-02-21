package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGr() {
        return greetingService.sayGreeting();
    }
}
