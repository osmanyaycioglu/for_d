package com.ford.customer;

public class Customer {
	private String name;
	private String surname;
	private String username;
	private String password;
	private int age;
	
	
	public Customer(String name, String surname, String username, String password, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", username=" + username + ", password=" + password
				+ ", age=" + age + "]";
	}
	
	
}
