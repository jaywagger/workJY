package chap07OOP;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	
	//기본생성자
	public Account() {
	}
	public Account(String account, int balance, String ownerName) {
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	} 
	
	//Set&Get
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	//입금
	public void Deposit(int money) {
		 this.balance += money;
	}	
	
	//출금
		public void Withdraw(int money) {
			this.balance -= money;
		}
	//프린트
		public void print() {
			System.out.println("계좌정보: "+this.account+" 현재정보 "+this.balance);
		}
		
}
