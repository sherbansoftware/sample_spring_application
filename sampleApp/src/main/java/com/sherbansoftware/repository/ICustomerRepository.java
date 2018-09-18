package com.sherbansoftware.repository;

import java.util.List;

import com.sherbansoftware.model.Customer;

public interface ICustomerRepository {

	List<Customer> createCustomers();
	
	void updateCustomer(Customer original, Customer updated);
	
}