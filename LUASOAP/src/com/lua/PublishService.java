package com.lua;

import javax.xml.ws.Endpoint;

import com.lua.infrastructure.controller.LUAAPIImpl;

public class PublishService {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/WS/Users", new LUAAPIImpl());
		
	}

}
