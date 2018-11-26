package com.example.service;

import com.example.demo.JsonMessage;
import com.example.demo.ListaSalida;

public interface InterfaceService {

	public  JsonMessage getData();
	
	public ListaSalida getlistaLambda();
	
	public JsonMessage calcularPromedio(double a, double b);

	public JsonMessage parserData(String dato);
	
	public JsonMessage ordenStream(String busqueda);
}
