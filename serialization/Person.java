package com.prowings.serialization;

import java.io.Serializable;

public class Person implements Serializable{

	private String gender;
	private float height;
	private int weight;
	
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Person(String gender, float height, int weight) {
		super();
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
