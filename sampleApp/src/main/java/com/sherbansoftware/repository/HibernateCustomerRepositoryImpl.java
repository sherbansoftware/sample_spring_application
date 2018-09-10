package com.sherbansoftware.repository;

import java.util.ArrayList;
import java.util.List;

import com.sherbansoftware.model.Customer;

public class HibernateCustomerRepositoryImpl implements ICustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sherbansoftware.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer c1 = new Customer();
		c1.setAge(32);
		c1.setLastName("Mihai");
		c1.setFirstName("Serban");

		Customer c2 = new Customer("Serban", "Mihai", 32);

		customers.add(c1);
		customers.add(c2);

		return customers;
	}

}
