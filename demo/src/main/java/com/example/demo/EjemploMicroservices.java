package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.InterfaceService;

@RestController
@RequestMapping("/rest/demo")
@EnableAutoConfiguration
public class EjemploMicroservices {
	
	@Autowired
	private InterfaceService interfaceService;
	
	@GetMapping("/get")
	public JsonMessage getInformation() {
		
		return interfaceService.getData();
		
	}
}
