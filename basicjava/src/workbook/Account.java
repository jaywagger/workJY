package workbook;

public class Account {
	private String account;
	private int balance;
	private double interestRate; //이자율
	
	//기본생성자
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	} //오른쪽 클릭-소스-generate에 있다
	
	
	
	//계좌번호
	public void setAccount(String account) { 
		this.account = account;	
	}
	public String getAccount() { 
		return this.account;	
	}
	//잔액
	public void setBalance(int balance) { 
		this.balance = balance;	
	}
	public int getBalance() { 
		return this.balance;	
	}
	//이자율
	public void setInterateRate(double interestRate) { 
		this.interestRate = interestRate;	
	}
	public double InterateRate() { 
		return this.interestRate;	
	}	
	
	//이자
	public double CalculateInterest() { 
		double interest = (double)(this.balance*this.interestRate);
		System.out.println("이자:"+interest);
		return interest;
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
