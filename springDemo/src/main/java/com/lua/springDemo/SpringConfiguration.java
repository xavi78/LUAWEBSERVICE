package com.lua.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public HelloService helloService() {
		return new HelloServiceImpl();
	}
	
	
}
