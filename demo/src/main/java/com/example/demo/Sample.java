package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping(value="/")
	public String get() {
		return "<h1 style='color:red;text-align:center'>Hello World</h1>";
	}
	@GetMapping(value="/hi")
	public String getHi() {
		return "<body bgcolor='pink'><h1 style='color:red;text-align:center'>Hello World</h1>";
	}
}
