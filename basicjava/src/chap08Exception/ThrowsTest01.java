package chap08Exception;

import java.util.Scanner;

//���ܰ� �߻��� ������ ���ܸ� ó���ϵ��� ����
//���ܰ� �߻��� ������ ���ܸ� ó���Ϸ��� ȣ���ϴ� ������ � ���ܰ� �߻��ߴ��� �� �� ����
//���ܰ� �߻��� �� ��쿡 ���� �ٸ��� ó���ϰ� �; �� �� ����.
public class ThrowsTest01 {

	public int test(int num1, int num2) { //�޼ҵ�� 1�� �ϸ�. 
		int result = 0;
		try {
			System.out.println("----Test()�޼ҵ� ����-----");
			System.out.println("�Է°�: "+num1);//��길 �ϴ� �޼ҵ�
			System.out.println("�Է°�: "+num2);
			result = num1/num2;
			System.out.println("���: "+result);
			System.out.println("----Test()�޼ҵ� ����-----");
		}catch(ArithmeticException e){
			//���ܰ� �߻��� �̷��� ó���ض�
			result = 0; // ���� �߻��� 0�� �����ض�
		}return result;
		
	}
	public void show() {
		Scanner key = new Scanner(System.in); //���ڸ� �����ϴ� �޼ҵ�
		System.out.println("�����Է�: ");			//ȣ�� �޼ҵ�
		int num1 = key.nextInt();
		System.out.println("�����Է�: ");
		int num2 = key.nextInt();
		int result = test(num1,num2);
		
		//������ ����Ǿ�� �ϴ� ��ɹ�
		System.out.println("test()ȣ����: "+result);
	}
	
	public static void main(String[] args) {
		//static���ο��� show (non-static) ȣ���� ��, �ڽ��� Ŭ����,
		//��ü�����ؼ� ȣ���ؾ� �Ѵ�.
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
		
	}

}
