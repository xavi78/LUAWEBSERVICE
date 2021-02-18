package com.lua.springSoapDemo.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lua.springSoapDemo.schema.GetCountryRequest;
import com.lua.springSoapDemo.schema.GetCountryResponse;

@Endpoint
public class ApiStandarEndPoint {

	private static final String NAMESPACE_URI = "http://localhost:8080/springSoapDemo/apiStandard";
	
	public ApiStandarEndPoint() {
		
	}
			
	@PayloadRoot(namespace = NAMESPACE_URI, localPart= "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		
		System.out.println("Llamada a get Country");
		
		return null;
		
	}
	
	
}
