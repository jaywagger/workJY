package chap07OOP;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333","장동건"
					,1000000,"1234-5647-8888");
					//계좌, 주인, 잔액, 카드번호
		System.out.println("카드번호를 입력하세요: ");
		String cardNo = key.next();
		/*acc1.pay(500000,cardNo ); //카드번호 달라서 지불 불가능
		System.out.println("현재잔액====>"+acc1.getBalance());*/
		acc1.pay(500000,cardNo);
		System.out.println("현재잔액====>"+acc1.getBalance());
		
	}

}
