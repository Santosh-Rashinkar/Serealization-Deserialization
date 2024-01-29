package com.prowings.serialization;

import java.io.Serializable;

public class Employee extends Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private static String country = "India";

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	public Employee(int id,String name,String gender, float height, int weight) {
		super(gender, height, weight);
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Employee.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
