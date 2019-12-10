package workbook;

public class AccountTest {

	public static void main(String[] args) {
		//client 
		Account client = new Account();
		//Account 라는 틀을 client라는 이름으로 찍다.
		client.setAccount("441-0290-1203");
		client.setBalance(500000);
		client.setInterateRate(0.073);
		
		
		client.print();
		client.Deposit(20000);
		client.print();
		client.CalculateInterest();
		
		

	
		
		
	}

}
