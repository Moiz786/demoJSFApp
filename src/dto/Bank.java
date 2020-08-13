package dto;

import javax.annotation.PostConstruct;

public class Bank {
	private String name;
	private String branchCode;
	private Account accountInfo;
	

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public Account getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(Account accountInfo) {
		this.accountInfo = accountInfo;
	}
	
	@PostConstruct
	public void init() {
	    accountInfo = new Account();
	}

}
