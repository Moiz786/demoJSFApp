package dto;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="emp")
public class Employee {
	private String employeeName;
	private String designation;
	private Double salary;
	
	public Employee() {
		super();
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
	
	public String addEmployee(){
		System.out.println("Employee name: "+employeeName+ " Employee Designation: "+designation+ " Employee Salary: "+salary);
		return "success";
	}
}
