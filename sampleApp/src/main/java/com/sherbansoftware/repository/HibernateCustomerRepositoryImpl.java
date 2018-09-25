package com.sherbansoftware.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sherbansoftware.model.Customer;
import com.sherbansoftware.model.Identifiable;

@Repository
public class HibernateCustomerRepositoryImpl extends CustomerInMemoryRepositry<Identifiable>
		implements ICustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sherbansoftware.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> createCustomers() {
		List<Customer> customers = new ArrayList<>();

		Customer c1 = new Customer();
		c1.setId(new Long(1));
		c1.setAge(32);
		c1.setLastName("Michael");
		c1.setFirstName("Sherban");

		Customer c2 = new Customer(new Long(2), "Serban", "Mihai", 32);

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
		original.setComplete(updated.isComplete());
	}

	@Override
	protected void updateIfExists(Identifiable original, Identifiable desired) {
		original.setId(desired.getId());
	}
}
