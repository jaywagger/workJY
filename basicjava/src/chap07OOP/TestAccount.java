package chap07OOP;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","�嵿��"
					,1000000,"1234-5647-8888");
					//����, ����, �ܾ�, ī���ȣ
		System.out.println("ī���ȣ�� �Է��ϼ���: ");
		String cardNo = key.next();
		/*acc1.pay(500000,cardNo ); //ī���ȣ �޶� ���� �Ұ���
		System.out.println("�����ܾ�====>"+acc1.getBalance());*/
		acc1.pay(500000,cardNo);
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		
	}

}
