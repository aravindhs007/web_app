package com.oasys.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {

}
