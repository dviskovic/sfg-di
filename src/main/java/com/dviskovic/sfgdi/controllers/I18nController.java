package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    public final GreetingService service;

    public I18nController(@Qualifier("i18nService") GreetingService service) {
        this.service = service;
    }

    public String sayGreeting() {
        return service.sayGreeting();
    }
}
