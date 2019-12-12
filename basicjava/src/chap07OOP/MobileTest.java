package chap07OOP;

public class MobileTest {

	public static void main(String[] args) {
		Ltab user1 = new Ltab("Ltab",500,"AP-01");
		Otab user2 = new Otab("Otab",1000,"AND-20");
		
		user1.display1();
		user1.display2();
		user2.display2();
		System.out.println();
		System.out.println("10분 충전");
		user1.display1();
		
		user1.Charge(10);
		user2.Charge(10);
		user1.display2();
		user2.display2();
		
		System.out.println();
		System.out.println("5분 통화");
		user1.display1();
		user1.Operate(5);
		user2.Operate(5);
		user1.display2();
		user2.display2();
		
		
	}

}
