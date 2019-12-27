package chap08Exception;

import java.util.Scanner;

//메소드를 호출하는 곳에서 예외를 처리하도록 설정
public class ThrowsTest02 {
	//Test메소드는 ArithmeticException 이 발생 할 수 있는 메소드다
	public int test(int num1, int num2) 
			throws ArithmeticException, NullPointerException{ 
		int result = 0;
		System.out.println("----Test()메소드 내부-----");
		System.out.println("입력값: "+num1);//계산만 하는 메소드
		System.out.println("입력값: "+num2);
		result = num1/num2;
		System.out.println("결과: "+result);
		System.out.println("----Test()메소드 내부-----");
		return result;
		
	}
	//호출하는 부분에서 예외처리
	public void show() {
		Scanner key = new Scanner(System.in); //숫자를 전달하는 메소드
		int result =0;
		int num1=0;
		int num2=0;
		try {
			System.out.println("숫자입력: ");			//호출 메소드
			num1 = key.nextInt();
			System.out.println("숫자입력: ");
			num2 = key.nextInt();
			result = test(num1,num2);
		}catch(ArithmeticException e) {
			//num1이 10의 배수이면 result에 10000을 할당
			//num1이 7의 배수이면 result에 10000dmf gkfekd
			//그 외 result에 100할당
			if (num1%10==0) {
				result =10;
			}else if (num1%7==0) {
				result =7;
			}else {
				result =100;
			}
		}
		//무족건 실행되어야 하는 명령문
		finally {
		System.out.println("test()호출결과: "+result);
		}
	}
	
	public static void main(String[] args) {
		//static메인에서 show (non-static) 호출할 떄, 자신의 클래라도,
		//객체생성해서 호출해야 한다.
		ThrowsTest02 obj = new ThrowsTest02();
		obj.show();
		
		
	}

}
