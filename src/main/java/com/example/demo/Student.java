package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private int roll;
	//@Autowired
	private Address address;// property based DI
	
	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;//Setter based DI
	}
	@Autowired
	public Student(Address address) {
		super();
		this.address = address;//Construtor based DI
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
}
