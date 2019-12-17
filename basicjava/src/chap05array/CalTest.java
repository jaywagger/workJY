package chap05array;

import chap08Exception.Calculator;
//워크북 67페이지 2번문제
public class CalTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("정수를 입력하세요: "+args[0]);
		System.out.println("정수를 입력하세요: "+args[2]);
		int num1 = Integer.parseInt(args[0]); 
		int num2 = Integer.parseInt(args[2]);
		System.out.println("결과: "+calc.divide(num1, num2));
	}
}


