package com.sherbansoftware.logic;

import java.util.List;

import com.sherbansoftware.model.Customer;

public interface ICustomerService {

	List<Customer> findAll();
}