package chap08Exception.Account;
//��ũ�� 67������ 2������
public class Calculator {
	public Calculator() {
	}
	public double divide(int num1, int num2) {
		double divide = 0.0;
		try {divide = num1/num2;
		}catch (ArithmeticException e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}catch (Exception e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return divide;
	}
}
