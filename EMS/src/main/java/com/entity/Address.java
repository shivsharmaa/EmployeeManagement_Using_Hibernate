package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	@Column
	private String hno;
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String pincode;
	@Column
	private String State;
	
	
	public Address(String hno, String area, String city, String pincode, String state) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		State = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	
	
}
