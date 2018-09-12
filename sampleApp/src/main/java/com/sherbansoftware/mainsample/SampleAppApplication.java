package com.sherbansoftware.mainsample;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sherbansoftware.logic.ICustomerService;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SampleAppApplication.class, args);
		// ICustomerService iCustomerService = new CustomerServiceImpl();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService iCustomerService = applicationContext.getBean("customerService", ICustomerService.class);
		String firstName = iCustomerService.findAll().get(0).getFirstName();
		System.out.println("First name is: " + firstName);
		
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
