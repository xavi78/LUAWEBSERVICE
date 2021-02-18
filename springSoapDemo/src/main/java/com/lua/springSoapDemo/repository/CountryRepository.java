package com.lua.springSoapDemo.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.lua.springSoapDemo.schema.Country;
import com.lua.springSoapDemo.schema.Currency;

@Component
public class CountryRepository {

	private static final Map<String, Country> countries = new HashMap<>();
	
	
	@PostConstruct
	public void initData() {
		
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(465254545);
		
		countries.put(spain.getName(),spain);
		
		Country uk = new Country();
		uk.setName("United Kingdom");
		uk.setCapital("London");
		uk.setCurrency(Currency.GBP);
		uk.setPopulation(4);
		
		countries.put(uk.getName(), uk);
		
	}
	
	public Country findCountry(String name) {
		Assert.notNull(name, "Nombre no válido");
		return countries.get(name);
		
	}
	
	
	
}
