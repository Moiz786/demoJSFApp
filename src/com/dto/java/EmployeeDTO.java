package com.dto.java;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="emp")
public class EmployeeDTO {
	private int employeeId;
	private String employeeName;
	private String designation;
	private Double salary;
	
	public EmployeeDTO() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
