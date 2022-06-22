package com.mirdu.spring1.component;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	private int regno;
	private String model;
	private String brand;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void drive()
	{
		System.out.println("DRIVE BY CAR");
	}
}
