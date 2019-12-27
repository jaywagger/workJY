package chap08Exception.Account;
//워크북 67페이지 2번문제
public class Calculator {
	public Calculator() {
	}
	public double divide(int num1, int num2) {
		double divide = 0.0;
		try {divide = num1/num2;
		}catch (ArithmeticException e) {
			System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
		}catch (Exception e) {
			System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
		}
		return divide;
	}
}
