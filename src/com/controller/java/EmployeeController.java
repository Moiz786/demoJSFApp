package com.controller.java;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.dao.java.EmployeeDAOImpl;
import com.dao.java.IEmployeeDAO;
import com.dto.java.EmployeeDTO;


@ManagedBean (name="empController")
public class EmployeeController implements Serializable{
	
	private static EmployeeDTO emp1 = new EmployeeDTO();
	
	public static void addEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.insert(emp1);
		//return returnPage;
	}
	
	public static void editEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.update(emp1);
		//return returnPage;
	}
	
	public static void deleteEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.delete(emp1);
		//return returnPage;
	}
	
	public static List<EmployeeDTO> listEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		List<EmployeeDTO> employeesList= empDao.fetch();
		
		return employeesList;
	}
	

	

}
