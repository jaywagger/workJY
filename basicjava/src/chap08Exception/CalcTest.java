package chap08Exception;

public class CalcTest {

	public static void main(String[] args) {
		//client 
		Account client = new Account("441-0290-1203",500000,0.073);
		
		/*System.out.println("��������: "+client.getAccount()+"\t"+"���� �ܾ�: "+client.getBalance()
		+"\t"+"������: "+client.getInterateRate());*/
		
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
			System.out.println("��� �ݾ��� 0���� ���ų� ��ݾ��� �ʹ� �����ϴ�.");
		}
		/*client.print();
		client.CalculateInterest();*/
		
		
		
	}

}
