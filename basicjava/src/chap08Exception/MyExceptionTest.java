package chap08Exception;

import java.util.Scanner;

//Ȧ���� �ԷµǸ� ���ܸ� �߻���Ų��.
public class MyExceptionTest {
	public static void main (String[]args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�����Է� ");
		int num = key.nextInt();
		try {
			if(num%2==1) {
				//���ܹ߻� ��Ȱ
				//JVM�� �ν��ϴ� ������ �ƴ϶� ����ڰ� ������ �����̹Ƿ�
				//���ܸ� �߻���ų �� �ֵ��� ����
				throw new MyException("Ȧ���� �Է��ϼ̽��ϴ�.");
			}
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
