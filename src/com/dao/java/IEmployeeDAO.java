package com.dao.java;

import java.util.List;
import org.hibernate.Session;
import com.dto.java.EmployeeDTO;

public interface IEmployeeDAO {
	
	public void insert(EmployeeDTO employee) throws Exception;
	
	public void update(EmployeeDTO employee) throws Exception;
	
	public void delete(EmployeeDTO employee) throws Exception;
	
	public List<EmployeeDTO> fetch() throws Exception;
	
}
