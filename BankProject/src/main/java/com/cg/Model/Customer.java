package com.cg.Model;

public class Customer
{
	private int custId;
	private String custName;
	public Address address;
	
	public Customer(int custId, String custName, Address address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	
	
	

}
