package chap06method;
//�޼ҵ� ���� ������ ���� Ŭ����
public class MyMethod {
	//4. �Ű�����, ���ϰ��� ��� �ִ� �޼ҵ�
	//=> ���� 2���� �Ű������� ���޹޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	//�޼ҵ� ����ο� return type�� �����ϴ� ��� �ݵ�� �޼ҵ��� ����������
	//���� return�ؾ� �մϴ�.
	public int add(int num1, int num2) {
	//add��� �޼ҵ带 ȣ���� ��, 2�� �������� �Ű������� �ϰ�, ���� ��Ʈ���� ����� ȣ��
		int result =0;
		result = num1+num2;
		return result;
		//�Ű������� Ȱ���Ͽ� ���������� �����ϴ� ������ Ÿ�Զ��� ����ؾ� ��.
	}
	
	public int subtr(int num1, int num2) {
	//add��� �޼ҵ带 ȣ���� ��, 2�� �������� �Ű������� �ϰ�, ���� ��Ʈ���� ����� ȣ��
		int result =0;
		result = num1-num2;
		return result;
		//�Ű������� Ȱ���Ͽ� ���������� �����ϴ� ������ Ÿ�Զ��� ����ؾ� ��.
	}

	
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void display() {
			
		for(int i =1; i<10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//2. ���� ���� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str) {
		
		for(int i =1; i<10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	//2. ���� ���� ���� �Ű������� �� ���� �޼ҵ�
	public void display(String str, int count) {
		
		for(int i =1; i<10; i++) {
			System.out.print("str");
		}
		System.out.println();

	}
}