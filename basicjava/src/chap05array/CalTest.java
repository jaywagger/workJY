package chap05array;

import chap08Exception.Calculator;
//��ũ�� 67������ 2������
public class CalTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("������ �Է��ϼ���: "+args[0]);
		System.out.println("������ �Է��ϼ���: "+args[2]);
		int num1 = Integer.parseInt(args[0]); 
		int num2 = Integer.parseInt(args[2]);
		System.out.println("���: "+calc.divide(num1, num2));
	}
}


