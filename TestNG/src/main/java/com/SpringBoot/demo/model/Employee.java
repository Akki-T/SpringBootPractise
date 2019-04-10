package com.SpringBoot.demo.model;

public class Employee {

	private int EmpId;
	private String name;
	private String designation;
	
	public Employee() {
		super();
	}
	public Employee(int EmpId, String name, String designation) {
		super();
		this.EmpId = EmpId;
		this.name = name;
		this.designation = designation;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
