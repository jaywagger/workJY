package chap06method;
//메소드 정의 연습을 위한 클래스
public class MyMethod {
	//4. 매개변수, 리턴값이 모두 있는 메소드
	//=> 숫자 2개를 매개변수로 전달받아 더해서 결과를 리턴하는 메소드
	//메소드 선언부에 return type을 정의하는 경우 반드시 메소드의 마지막에서
	//값을 return해야 합니다.
	public int add(int num1, int num2) {
	//add라는 메소드를 호출할 때, 2개 정수값을 매개변수로 하고, 최종 인트형의 결과가 호출
		int result =0;
		result = num1+num2;
		return result;
		//매개변수를 활용하여 최종적으로 리턴하는 변수의 타입또한 명시해야 함.
	}
	
	public int subtr(int num1, int num2) {
	//add라는 메소드를 호출할 때, 2개 정수값을 매개변수로 하고, 최종 인트형의 결과가 호출
		int result =0;
		result = num1-num2;
		return result;
		//매개변수를 활용하여 최종적으로 리턴하는 변수의 타입또한 명시해야 함.
	}

	
	//1. 매개변수가 없고 리턴값이 없는 메소드
	public void display() {
			
		for(int i =1; i<10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//2. 리턴 값이 없고 매개변수가 한 개인 메소드
	public void display(String str) {
		
		for(int i =1; i<10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	//2. 리턴 값이 없고 매개변수가 한 개인 메소드
	public void display(String str, int count) {
		
		for(int i =1; i<10; i++) {
			System.out.print("str");
		}
		System.out.println();

	}
}