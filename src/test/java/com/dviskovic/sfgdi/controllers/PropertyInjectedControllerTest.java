package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.service = new ConstructorGreetingService();
    }

    @Test
    void getGr() {
        System.out.println(controller.getGr());
    }
}