package com.dviskovic.sfgdi;

import com.dviskovic.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SfgDiApplication.class, args);

		var c = (MyController) ctx.getBean("myController");
		var t = c.hi();

		System.out.println(t);
	}

}
