package dao;

import java.util.List;

import dto.Customer;

public interface ICustomer {
	
	public void insert(Customer customer) throws Exception;
	
	public void update (Customer customer) throws Exception;
	
	public void delete (Customer customer) throws Exception;

	public List<Customer> fetchCustomers();
	

}
