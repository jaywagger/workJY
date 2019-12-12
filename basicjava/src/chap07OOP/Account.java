package chap07OOP;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	
	//�⺻������
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
	
	//�Ա�
	public void Deposit(int money) {
		 this.balance += money;
	}	
	
	//���
		public void Withdraw(int money) {
			this.balance -= money;
		}
	//����Ʈ
		public void print() {
			System.out.println("��������: "+this.account+" �������� "+this.balance);
		}
		
}
