package service;

import javax.faces.event.NamedEvent;

import dao.ICustomer;

@NamedEvent
public class CustomerService implements ICustomerService{

	private ICustomer customer;
	
	@Override
	public Double checkBalance(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void depositFunds(String accountNum, Double funds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawCash(String accountNum, Integer cash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferFunds(String accountNum1, String accountNum2, Double funds) {
		// TODO Auto-generated method stub
		
	}

}
