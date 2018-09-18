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
	public List<Customer> createCustomers() {
		List<Customer> customers = new ArrayList<>();

		Customer c1 = new Customer();
		c1.setId(1);
		c1.setAge(32);
		c1.setLastName("Michael");
		c1.setFirstName("Sherban");

		Customer c2 = new Customer(2, "Serban", "Mihai", 32);

		customers.add(c1);
		customers.add(c2);

		return customers;
	}

	@Override
	public void updateCustomer(Customer original, Customer updated) {
		original.setId(updated.getId());
		original.setAge(updated.getAge());
		original.setFirstName(updated.getFirstName());
		original.setLastName(updated.getLastName());
	}

}
