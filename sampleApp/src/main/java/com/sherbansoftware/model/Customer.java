package com.sherbansoftware.model;

public class Customer {
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private boolean isComplete;

	public Customer() {

	}

	public Customer(Long id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public void markComplete() {
		setComplete(true);
	}

	public void markIncomplete() {
		setComplete(false);
	}

	public boolean isComplete() {
		return isComplete;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
