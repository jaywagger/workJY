package chap04conditionalStatement;
//Switch를 사용하기 위한 기본 문법
//if-else를 대신할 수 있는 제어문
//MultiifTest 문제를 Switch로 변경 예제
import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요: ");
		int ssn = key.nextInt();
		
		// Switch는 true or false를 판단할 수 있는 조건이아니라
		// 평가값이 저장된 변수, 연산식, 및 메소드일 경우. 딱 떨어지는 값으로 사용
		
		switch (ssn) 
		{
			case 1: //ssn 변수에 저장된 값을 사용할 때. 비교연산자 사용 불가
				System.out.println("남자");
				break; //break; 를 사용하지 않을 시 밑에도 포함된다.
					   // break;를 만나면 break가 속해있는 블럭은 빠저나간다.
			case 2:
				System.out.println("여자");
				break;
			case 3:
				System.out.println("남자");
				break;
			case 4:
				System.out.println("여자");
				break;
			default: //if문의 else와 같은 역할
				System.out.println("잘못입력");		
		}

	}

}
