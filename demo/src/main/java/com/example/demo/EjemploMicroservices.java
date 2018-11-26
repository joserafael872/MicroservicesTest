package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.InterfaceService;
import com.example.service.Operacion;

@RestController
@RequestMapping("/rest/")
@EnableAutoConfiguration
public class EjemploMicroservices {
	
	@Autowired
	private InterfaceService interfaceService;
	
	@GetMapping("/get")
	public JsonMessage getInformation() {
		
		return interfaceService.getData();
		
	}
	
	@GetMapping("/getlista")
	public ListaSalida getLista() {
		
		return interfaceService.getlistaLambda();
		
	}
	
	@GetMapping("/getpromedio")
	public JsonMessage getPromedio() {
		
		return interfaceService.calcularPromedio(5, 4);
		
	}	
	
	@GetMapping("/getparser")
	public JsonMessage getParser() {
		
		return interfaceService.parserData("30");
		
	}
	
	@GetMapping("/getorden/{busqueda}")
	public JsonMessage getOrden(@PathVariable String busqueda) {
		
		return interfaceService.ordenStream(busqueda);
		
	}

}
