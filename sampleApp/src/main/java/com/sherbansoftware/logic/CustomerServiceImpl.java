package com.sherbansoftware.logic;

import java.util.List;

import com.sherbansoftware.model.Customer;
import com.sherbansoftware.repository.ICustomerRepository;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerRepository iCustomerRepository;
	
	//necessary for constructor injection
	public CustomerServiceImpl() {
		
	}

	public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
		super();
		this.iCustomerRepository = iCustomerRepository;
	}

	@Override
	public List<Customer> createCustomers() {
		return iCustomerRepository.createCustomers();
	}

	@Override
	public void updateCustomer(Customer original, Customer updated) {
		iCustomerRepository.updateCustomer(original, updated);
	}
	
	public void setCustomerRepository(ICustomerRepository customerRepository) {
		this.iCustomerRepository = customerRepository;
	}
}
