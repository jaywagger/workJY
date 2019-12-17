package chap08Exception;

public class CalcTest {

	public static void main(String[] args) {
		//client 
		Account client = new Account("441-0290-1203",500000,0.073);
		
		/*System.out.println("계좌정보: "+client.getAccount()+"\t"+"현재 잔액: "+client.getBalance()
		+"\t"+"이자율: "+client.getInterateRate());*/
		
		client.print();
		try {
				client.Deposit(-10);
			}
		catch(Exception e) {
				System.out.println(e.getMessage());
			}
		try {
			client.Withdraw(600000);
		}
		catch(Exception e) {
			System.out.println("출금 금액이 0보다 적거나 출금액이 너무 많습니다.");
		}
		/*client.print();
		client.CalculateInterest();*/
		
		
		
	}

}
