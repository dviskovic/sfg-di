package com.dviskovic.sfgdi.controllers;

import com.dviskovic.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.service = new GreetingServiceImpl();
    }

    @Test
    void getGr() {
        System.out.println(controller.getGr());
    }
}