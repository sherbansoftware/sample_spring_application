package com.sherbansoftware.mainsample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sherbansoftware.logic.ICustomerService;
import com.sherbansoftware.model.Customer;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SampleAppApplication.class, args);
		// ICustomerService iCustomerService = new CustomerServiceImpl();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService iCustomerService = applicationContext.getBean("customerService", ICustomerService.class);
		System.out.println("List customer");
		
		for (Customer customer : iCustomerService.createCustomers()) {
			int id = customer.getId();
			String firstName = customer.getFirstName();
			String lastName = customer.getLastName();
			int age = customer.getAge();
			System.out.println("id: " + id + "\t " + "firstName: " + firstName + "\t " + "lastName: " + lastName + "\t "
					+ "age: " + age);
		}

		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
