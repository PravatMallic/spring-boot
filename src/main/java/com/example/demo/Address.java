package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Address {
	private String state;
	private String city;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
