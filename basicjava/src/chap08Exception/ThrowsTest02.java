package chap08Exception;

import java.util.Scanner;

//�޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����
public class ThrowsTest02 {
	//Test�޼ҵ�� ArithmeticException �� �߻� �� �� �ִ� �޼ҵ��
	public int test(int num1, int num2) 
			throws ArithmeticException, NullPointerException{ 
		int result = 0;
		System.out.println("----Test()�޼ҵ� ����-----");
		System.out.println("�Է°�: "+num1);//��길 �ϴ� �޼ҵ�
		System.out.println("�Է°�: "+num2);
		result = num1/num2;
		System.out.println("���: "+result);
		System.out.println("----Test()�޼ҵ� ����-----");
		return result;
		
	}
	//ȣ���ϴ� �κп��� ����ó��
	public void show() {
		Scanner key = new Scanner(System.in); //���ڸ� �����ϴ� �޼ҵ�
		int result =0;
		int num1=0;
		int num2=0;
		try {
			System.out.println("�����Է�: ");			//ȣ�� �޼ҵ�
			num1 = key.nextInt();
			System.out.println("�����Է�: ");
			num2 = key.nextInt();
			result = test(num1,num2);
		}catch(ArithmeticException e) {
			//num1�� 10�� ����̸� result�� 10000�� �Ҵ�
			//num1�� 7�� ����̸� result�� 10000dmf gkfekd
			//�� �� result�� 100�Ҵ�
			if (num1%10==0) {
				result =10;
			}else if (num1%7==0) {
				result =7;
			}else {
				result =100;
			}
		}
		//������ ����Ǿ�� �ϴ� ��ɹ�
		finally {
		System.out.println("test()ȣ����: "+result);
		}
	}
	
	public static void main(String[] args) {
		//static���ο��� show (non-static) ȣ���� ��, �ڽ��� Ŭ����,
		//��ü�����ؼ� ȣ���ؾ� �Ѵ�.
		ThrowsTest02 obj = new ThrowsTest02();
		obj.show();
		
		
	}

}
