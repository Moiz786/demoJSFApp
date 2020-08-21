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
	
	public static String addEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.insert(emp1);
		return returnPage;
	}
	
	public static String editEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.update(emp1);
		return returnPage;
	}
	
	public static String deleteEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		empDao.delete(emp1);
		return returnPage;
	}
	
	public static String listEmployee() throws Exception{
		String returnPage = "employee";
		IEmployeeDAO empDao = new EmployeeDAOImpl();
		List<EmployeeDTO> employeesList= empDao.fetch();
		
		return returnPage;
	}

}
