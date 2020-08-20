package com.cg.service;

import com.cg.Model.Account;
import com.cg.Model.Customer;
import com.cg.exception.MinimumBalanceException;

public interface BankService 
{

	public Account createAccount(Customer customer, int i) throws MinimumBalanceException;
	

}
