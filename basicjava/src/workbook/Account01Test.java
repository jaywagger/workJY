package workbook;
//Account01�� �׽�Ʈ Ŭ����
public class Account01Test {

	public static void main(String[] args) {
		Account account  = new Account(); //�ν��Ͻ� ����
		account.setAccount("441-0290-1203"); //�����Է�
		account.setBalance(500000); //�����Է�
		account.setInterateRate(7.3); //�����Է�
		
		//getter�� �̿��Ͽ� ���� ���
		System.out.println("��������: "+account.getAccount() 
		+" �����ܾ�: "+account.getBalance());
		
		account.Deposit(20000); //deposit �޼ҵ带 Ȱ���Ͽ� 2���� ������� ������ ����
		System.out.println("��������: "+account.getAccount() 
		+" �����ܾ�: "+account.getBalance());
		System.out.println("����:"+account.CalculateInterest());
		
		
		
	}

}
