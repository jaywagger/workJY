package chap07OOP;

public class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount() {
	}
	public CheckingAccount(String account, String ownerName, 
									int balance, String cardNo) {
		super(account,balance,ownerName); // Parent Class�� �����ڿ� ����
		/*super.account = account; �̰� Parent Class�� ������ ���� �����ε�
		super.balance = balance; Private���� �����־ �ȉ�*/
		this.cardNo = cardNo;
	}
						//private String cardNo;�� �ٸ�. ���� ����ڰ� �Է°�
	public void pay(int amount, String cardNo) { 
		//if(cardNo == "1234-5647-8888")
		if(this.cardNo.equals(cardNo)  && getBalance()>=amount){	 
			//������ �񱳴� ������ ==�� �ƴ� .equals()�� �Ѵ�
			System.out.println("������ �����մϴ�.");
					Withdraw(amount);
		}
		else
		{
			System.out.println("������ �Ұ����մϴ�.");
		}
		
	}

	
}
