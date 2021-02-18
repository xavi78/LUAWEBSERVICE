package com.lua.springDemo;

import org.springframework.stereotype.Service;

@Service("HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public void HolaMundo() {
		System.out.println("\n Hola Mundo \n");
		
		
	}

}
