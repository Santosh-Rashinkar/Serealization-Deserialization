package com.prowings.serialization;

import java.io.Serializable;

public class Head implements Serializable {

	private String vendorName;
	private int headNumber;

	public Head() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Head(String vendorName, int headNumber) {
		super();
		this.vendorName = vendorName;
		this.headNumber = headNumber;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getHeadNumber() {
		return headNumber;
	}

	public void setHeadNumber(int headNumber) {
		this.headNumber = headNumber;
	}

	@Override
	public String toString() {
		return "Head [vendorName=" + vendorName + ", headNumber=" + headNumber + "]";
	}

}