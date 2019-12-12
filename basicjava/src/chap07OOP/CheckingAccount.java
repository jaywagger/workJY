package chap07OOP;

public class CheckingAccount extends Account{
	private String cardNo;
	
	public CheckingAccount() {
	}
	public CheckingAccount(String account, String ownerName, 
									int balance, String cardNo) {
		super(account,balance,ownerName); // Parent Class의 생성자에 접근
		/*super.account = account; 이건 Parent Class의 변수에 직접 접근인데
		super.balance = balance; Private으로 막혀있어서 안됌*/
		this.cardNo = cardNo;
	}
						//private String cardNo;와 다름. 저건 사용자가 입력값
	public void pay(int amount, String cardNo) { 
		//if(cardNo == "1234-5647-8888")
		if(this.cardNo.equals(cardNo)  && getBalance()>=amount){	 
			//문자형 비교는 무족건 ==가 아닌 .equals()로 한다
			System.out.println("지불이 가능합니다.");
					Withdraw(amount);
		}
		else
		{
			System.out.println("지불이 불가능합니다.");
		}
		
	}

	
}
