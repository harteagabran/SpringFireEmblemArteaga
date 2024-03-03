package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Unit;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Mar 3, 2024
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Unit unit() {
		Unit bean = new Unit("Unitname", "Soldier", 10, 2, 2);
		return bean;
	}
}
