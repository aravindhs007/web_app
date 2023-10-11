package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Addition {
	@GetMapping (value="/add/{num1}/{num2}")
	public int add(@PathVariable int num1,@PathVariable int num2) {
		return num1+num2;
	}
}
