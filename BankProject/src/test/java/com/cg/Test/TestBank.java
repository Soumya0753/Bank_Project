package com.cg.Test;
import org.junit.Assert;
import org.junit.Test;

import com.cg.Model.Address;
import com.cg.Model.Customer;
import com.cg.exception.MinimumBalanceException;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;

public class TestBank 
{
	public BankService bank;
	
	public TestBank()
	{
		bank = new BankServiceImpl();
	}
	
	@Test(expected = MinimumBalanceException.class)
	public void checkAccountCreation() throws MinimumBalanceException
	{
		Customer customer = new Customer();
		customer.setCustId(1000);
		customer.setCustName("Soumya");
		customer.setAddress(new Address("bbsr","Odisha")); 

		
		
		bank.createAccount(customer,500);
		
	}

}
