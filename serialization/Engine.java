package com.prowings.serialization;

import java.io.Serializable;

public class Engine implements Serializable {

	private String type;
	private float capacity;
	private Head head;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String type, float capacity, Head head) {
		super();
		this.type = type;
		this.capacity = capacity;
		this.head = head;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + ", head=" + head + "]";
	}

}
