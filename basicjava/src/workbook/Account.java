package workbook;

public class Account {
	private String account;
	private int balance;
	private double interestRate; //������
	
	//�⺻������
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
	public double InterateRate() { 
		return this.interestRate;	
	}	
	
	//����
	public double CalculateInterest() { 
		double interest = (double)(this.balance*this.interestRate);
		System.out.println("����:"+interest);
		return interest;
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
