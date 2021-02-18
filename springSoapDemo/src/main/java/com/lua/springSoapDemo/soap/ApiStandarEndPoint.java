package com.lua.springSoapDemo.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.lua.springSoapDemo.repository.CountryRepository;
import com.lua.springSoapDemo.schema.GetCountryRequest;
import com.lua.springSoapDemo.schema.GetCountryResponse;

@Endpoint
public class ApiStandarEndPoint {

	private static final String NAMESPACE_URI = "schema";
	
	private CountryRepository countryRepository;
		
	@Autowired
	public ApiStandarEndPoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
		
	}
			
	@PayloadRoot(namespace = NAMESPACE_URI, localPart= "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		
		System.out.println("Llamada a get Country");
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));
		return response;
	}
	
	
}
