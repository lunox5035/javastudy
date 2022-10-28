package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	private String account;
		
	//메소드

	public Account(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}
	
	public String getAccString() {
		return account;
	}
		
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setAccount(String string) {
		this.account=account;
	}
	
	public int save(int i) {
		return balance-i;
		
	}
	
	public int deposit(int i) {
		return balance+i;
		
	}

}
