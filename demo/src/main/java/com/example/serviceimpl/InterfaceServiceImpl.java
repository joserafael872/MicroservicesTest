package com.example.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.JsonMessage;
import com.example.service.InterfaceService;

@Service("InterfaceService")
public class InterfaceServiceImpl implements InterfaceService {

	@Override
	public JsonMessage getData() {
		JsonMessage jsonMessage = new JsonMessage();
		jsonMessage.setMessage("pruea de get con interface");
		return jsonMessage;
	}

}
