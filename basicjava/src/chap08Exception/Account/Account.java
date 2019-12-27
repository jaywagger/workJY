package chap08Exception.Account;

public class Account extends Exception{
	private String account;
	private int balance;
	private double interestRate; //������
	
	//�⺻������
	public Account() {
	} 
	//������
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	} //������ Ŭ��-�ҽ�-generate�� �ִ�
	
	//���¹�ȣ
	public void setAccount(String account) { 
		this.account = account;	
	}
	public String getAccount() { 
		return this.account;	
	}
	//�ܾ�
	public void setBalance(int balance) { 
		this.balance = balance;	
	}
	public int getBalance() { 
		return this.balance;	
	}
	//������
	public void setInterateRate(double interestRate) { 
		this.interestRate = interestRate;	
	}
	public double getInterateRate() { 
		return this.interestRate;	
	}	
	
	//����
	public double CalculateInterest() { 
		double interest = (double)(this.balance*this.interestRate);
		System.out.println("����:"+interest);
		return interest;
	}
	
	//�Ա�
	public void Deposit(int money)throws Exception {
		if(money <0) {
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�");
		} 
		this.balance += money;
	}
	//���
		public void Withdraw(int money) throws Exception{
			if(money <0 | balance <money) {
				throw new Exception();
			} 
			this.balance -= money;
		}
	//����Ʈ
		public void print() {
			System.out.println("��������: "+this.account+" �������� "+this.balance);
		}
		
}
