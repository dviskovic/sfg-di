package com.dviskovic.sfgdi;

import com.dviskovic.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SfgDiApplication.class, args);

		var i18n = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18n.sayGreeting());

		var c = (MyController) ctx.getBean("myController");
		System.out.println("primary injected:");
		System.out.println(c.hi());

		System.out.println("property injected:");
		var prop = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(prop.getGr());

		System.out.println("Setter injected:");
		var setter = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setter.getGr());

		System.out.println("Constructor injected:");
		var constr = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constr.getGr());
	}

}
