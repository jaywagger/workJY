package workbook;

public class Account01 {

	public class Account {
		private String account;
		private int balance;
		private double interestRate;
		//3���� �������
		
		//setter & getter: ������Ŭ�� - source - 'Getters&Setters'
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account; //��������� �Ű����� ����
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
		
		
		//�ٸ��޼ҵ�
		//CalculateInterest �޼ҵ�
		//���� �ܾ� �������� ���� ����ϱ�
		public double calculateInterest() { 
			//�δܾ� ���ս� �ι�° �ܾ� ù ���� �빮��.
			return (balance*interestRate/100);
		} 
		
		//�Ա� �޼ҵ�
		public void deposite(int money) {
			balance = balance+money;
		}
		//��� �޼ҵ�
		public void withdraw(int money) {
			balance = balance-money;
		}
		
	}
}
