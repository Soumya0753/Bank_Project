package com.cg.service;

import com.cg.Model.Account;
import com.cg.Model.Customer;
import com.cg.exception.MinimumBalanceException;

public class BankServiceImpl implements BankService 
{

	public Account createAccount(Customer customer, int i) throws MinimumBalanceException 
	{
		if(customer==null)
		{
			throw new IllegalArgumentException("customer not avaialable");
		}
		if(i<1000)
		{
			throw new MinimumBalanceException("Minimum balance must be 1000");
		}
		Account acc = new Account();
		acc.setAccountId(i);
		acc.setCustomer(customer);
		return acc;
	}


}
