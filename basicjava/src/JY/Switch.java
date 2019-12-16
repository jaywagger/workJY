package JY;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("What year are you in? ");
		Scanner key = new Scanner(System.in);
		int year = key.nextInt();
		switch (year) {
		case 1:
			System.out.println("1학년 입니다");
			break;
			
		case 2:
			System.out.println("2학년 입니다.");
			break;
			
		case 3:
			System.out.println("3학년 입니다");
			break;
			
		case 4:
			System.out.println("4학년 입니다.");
			break; 			
			
			default: System.out.println("잘못 입력하셨습니다.");}
	}

}
