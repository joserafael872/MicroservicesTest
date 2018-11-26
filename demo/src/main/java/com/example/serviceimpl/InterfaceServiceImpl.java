package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.example.demo.JsonMessage;
import com.example.demo.ListaSalida;
import com.example.service.InterfaceService;
import com.example.service.Operacion;

@Service("InterfaceService")
public class InterfaceServiceImpl implements InterfaceService {

	@Override
	public JsonMessage getData() {
		JsonMessage jsonMessage = new JsonMessage();
		jsonMessage.setMessage("pruea de get con interface");
		return jsonMessage;
	}

	@Override
	public ListaSalida getlistaLambda() {
		ListaSalida lista = new ListaSalida();
		List<JsonMessage> listJson = new ArrayList<>();
		
		List<String> listS = new ArrayList<>();
		listS.add("rafa");
		listS.add("jose");
		listS.add("alberto");
		
//		Collections.sort(listS, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		Collections.sort(listS, (String p1, String p2) -> p1.compareTo(p2));
		
		for(String elemento :listS) {
			JsonMessage msg = new JsonMessage();
			msg.setMessage(elemento);
			listJson.add(msg);			
		}
		
		lista.setSalida(listJson);
		return lista;
	}

	@Override
	public JsonMessage calcularPromedio(double a, double b) {
		JsonMessage msj = new JsonMessage();
		
//		Operacion operacion = new Operacion() {
//
//			@Override
//			public double calcular(double x, double y) {
//				return (x+y)/2;
//			}
//			
//		};				
//		
		Operacion operacion = (double x, double y) -> (x+y)/2;
		
		msj.setMessage(" " + operacion.calcular(6, 3));
		
		return msj;
	}

	@Override
	public JsonMessage parserData(String dato) {
		JsonMessage msj = new JsonMessage();
		
		Function<String, Integer> funcion1 = Integer::parseInt;
		int valor1 = funcion1.apply("20");
		
		msj.setNumber(valor1);
		return msj;
	}

	@Override
	public JsonMessage ordenStream(String busqueda) {
		JsonMessage salida = new JsonMessage();
		List<JsonMessage> listJson = new ArrayList<>();
		JsonMessage msg = new JsonMessage();
		msg.setMessage("juan");
		msg.setNumber(2);
		listJson.add(msg);
		
		JsonMessage msg2 = new JsonMessage();
		msg2.setMessage("carlos");
		msg2.setNumber(1);
		listJson.add(msg2);
		
		JsonMessage msg3 = new JsonMessage();
		msg3.setMessage("pedro");
		msg3.setNumber(3);
		listJson.add(msg3);
		
		JsonMessage msg4 = new JsonMessage();
		msg4.setMessage("jose");
		msg4.setNumber(4);
		listJson.add(msg4);
		
		int cant = (int) listJson.stream().filter(u -> u.getMessage().startsWith(busqueda)).count();
		
		salida.setNumber(cant);
		
		return salida;
	}
	

}
