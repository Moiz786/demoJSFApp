package dto;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="customer")
public class Customer {
	private String firstName;
	private String lastName;
	private int customerCode;
	private Bank bankdetails;
	private String accountNo;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}
	public Bank getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(Bank bankdetails) {
		this.bankdetails = bankdetails;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String add(){
		return "results";
	}
	
}
