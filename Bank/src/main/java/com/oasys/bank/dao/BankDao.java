package com.oasys.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.bank.entity.Bank;
import com.oasys.bank.repository.BankRepository;
@Repository
public class BankDao {
	@Autowired
	BankRepository bankrepo;
	public List<Bank> getall() {
		
		return bankrepo.findAll();
	}

}
