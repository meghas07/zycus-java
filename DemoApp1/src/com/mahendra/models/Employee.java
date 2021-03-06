package com.mahendra.models;

import java.io.Serializable;

//Mark this class for serializing
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1065855744541915413L;
	private String firstName, lastName;
	private int age;
	private String designation;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String firstName, String lastName, int age, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.designation = designation;
	}
	
	
}
