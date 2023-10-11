package com.oasys.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.customer.dao.CustomerDao;
import com.oasys.customer.entity.Customer;
@Service
public class CustomerService {
@Autowired
CustomerDao cusdao;
	public List<Customer> getAll() {
		return cusdao.getAll();
	}

}
