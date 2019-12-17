package chap08Exception;

import java.util.Scanner;

//예외가 발생된 곳에서 예외를 처리하도록 정의
//예외가 발생된 곳에서 예외를 처리하려면 호출하는 곳에서 어떤 예외가 발생했는지 알 수 없고
//예외가 발생할 떄 경우에 따라서 다르게 처리하고 싶어도 할 수 없다.
public class ThrowsTest01 {

	public int test(int num1, int num2) { //메소드는 1개 일만. 
		int result = 0;
		try {
			System.out.println("----Test()메소드 내부-----");
			System.out.println("입력값: "+num1);//계산만 하는 메소드
			System.out.println("입력값: "+num2);
			result = num1/num2;
			System.out.println("결과: "+result);
			System.out.println("----Test()메소드 내부-----");
		}catch(ArithmeticException e){
			//예외가 발생시 이렇게 처리해라
			result = 0; // 예외 발생시 0을 리턴해라
		}return result;
		
	}
	public void show() {
		Scanner key = new Scanner(System.in); //숫자를 전달하는 메소드
		System.out.println("숫자입력: ");			//호출 메소드
		int num1 = key.nextInt();
		System.out.println("숫자입력: ");
		int num2 = key.nextInt();
		int result = test(num1,num2);
		
		//무족건 실행되어야 하는 명령문
		System.out.println("test()호출결과: "+result);
	}
	
	public static void main(String[] args) {
		//static메인에서 show (non-static) 호출할 떄, 자신의 클래라도,
		//객체생성해서 호출해야 한다.
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
		
	}

}
