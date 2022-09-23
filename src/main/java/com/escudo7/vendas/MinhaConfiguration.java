package com.escudo7.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {
	
	@Bean(name = "applicationName")
	public String applicationName() {
		return "Sistema de vendas";
	}

}
