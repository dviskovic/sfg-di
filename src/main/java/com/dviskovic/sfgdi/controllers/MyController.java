package com.dviskovic.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hi() {
        System.out.println("hi");
        return "hello";
    }

}
