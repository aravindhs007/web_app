package com.oasys.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.bank.dao.BankDao;
import com.oasys.bank.entity.Bank;
import com.oasys.bank.repository.BankRepository;

@Service
public class BankService {
	@Autowired BankRepository bankrep;
	@Autowired
	BankDao bankdao;
	public List<Bank> getall() {
		
		return bankrep.findAll();
	}

}
