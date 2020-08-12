package service;

import java.sql.Date;

public class EmployeeService {
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public EmployeeService(Date createdDate) {
		super();
		this.createdDate = createdDate;
	}
	
	private String add(String name, String designation, Double salary){
		//database code here
		return null;
		
	}
	

}
