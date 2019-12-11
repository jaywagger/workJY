package workbook;

public class Account01 {

	public class Account {
		private String account;
		private int balance;
		private double interestRate;
		//3개의 멤버변수
		
		//setter & getter: 오른쪽클릭 - source - 'Getters&Setters'
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account; //멤버변수와 매개변수 구분
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public double getInterestRate() {
			return interestRate;
		}
		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		
		//다른메소드
		//CalculateInterest 메소드
		//현재 잔액 기준으로 이자 계산하기
		public double calculateInterest() { 
			//두단어 결합시 두번째 단어 첫 레터 대문자.
			return (balance*interestRate/100);
		} 
		
		//입금 메소드
		public void deposite(int money) {
			balance = balance+money;
		}
		//출금 메소드
		public void withdraw(int money) {
			balance = balance-money;
		}
		
	}
}
