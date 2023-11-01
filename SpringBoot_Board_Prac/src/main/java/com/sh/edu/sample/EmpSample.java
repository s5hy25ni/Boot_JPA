package com.sh.edu.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sh.edu.service.EmpRepository;

@Configuration
public class EmpSample {

	@Autowired
	private EmpRepository empRepository;
	
	/*
	 * @Bean CommandLineRunner commadLineRunner(EmpRepository empRepository) {
	 * return args -> {
	 * 
	 * } }
	 */
}
