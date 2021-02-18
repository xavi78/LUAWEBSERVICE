package com.lua.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDemoApplication.class);
		HelloService holaMundo = ctx.getBean("helloService", HelloService.class);
		holaMundo.HolaMundo();
		ctx.close();
		
	}

}
