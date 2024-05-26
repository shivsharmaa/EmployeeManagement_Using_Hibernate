package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private int empid;

	@Column
	private String ename;
	@Column
	private String gender;
	@Column
	private String mobile;
	@Column
	private String email;

	@Column
	private String dept;

	@Embedded
	private Address address;

	public Employee() {
		super();

	}

	public Employee(int empid, String ename, String gender, String mobile, String email, Address address, String dept) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.dept = dept;
	}

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", gender=" + gender + ", mobile=" + mobile
				+ ", email=" + email + ", dept=" + dept + ", address=" + address + "]";
	}

}
