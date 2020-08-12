package daoImpl;

import java.util.List;

import dao.ICustomer;
import dto.Customer;

public class CustomerDaoImpl implements ICustomer {

	@Override
	public void insert(Customer customer) throws Exception {
		System.out.println("Customer name:"+customer.getFirstName()+" "+customer.getLastName());
		System.out.println("Customer Code:"+customer.getCustomerCode());
		System.out.println("Customer Bank details:"+customer.getBankdetails().getName()+ " | BranchCode: "+customer.getBankdetails().getBranchCode());
		System.out.println("Customer Account no:"+customer.getAccountNo());
		
		System.out.println("Customer Info inserted");

	}

	@Override
	public void update(Customer customer) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer customer) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> fetchCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
