package JY;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("What year are you in? ");
		Scanner key = new Scanner(System.in);
		int year = key.nextInt();
		switch (year) {
		case 1:
			System.out.println("1�г� �Դϴ�");
			break;
			
		case 2:
			System.out.println("2�г� �Դϴ�.");
			break;
			
		case 3:
			System.out.println("3�г� �Դϴ�");
			break;
			
		case 4:
			System.out.println("4�г� �Դϴ�.");
			break; 			
			
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");}
	}

}
