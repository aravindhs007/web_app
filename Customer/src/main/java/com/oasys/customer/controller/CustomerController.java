package com.oasys.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.customer.entity.Customer;
import com.oasys.customer.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	CustomerService cusser;
	
	@GetMapping(value="/getlist")
	public List<Customer> getAll() {
		return cusser.getAll();
	}
}
