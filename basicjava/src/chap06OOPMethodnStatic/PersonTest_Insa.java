package chap06OOPMethodnStatic;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********************�λ�����ý���*******************");
		System.out.println("1. �λ���");
		System.out.println("2. ��������");
		System.out.println("3. ����������ȸ");
		System.out.println("4. ��������ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���: ");
		
		int work = key.nextInt();
		switch(work) {
		case 1:
			System.out.println("======�λ���=======");
			System.out.println("����: ");
			String name = key.next();
			System.out.println("�ּ�: ");
			String addr = key.next();
			System.out.println("����: ");
			int age = key.nextInt(); // Int key�� �ƴϰ� key.nextInt��
			
			//private���� �����. ������ ���߿�
/*			Person p = new Person();
			p.name = name; //Person ��ü�� name�����̰�, �ڿ� name�� ����ڰ� �Է��� ��������
			p.addr = addr;
			p.age = age;
			System.out.println(p.name+","+p.addr+","+p.age);*/
			
			break;
			
		case 2:
			System.out.println("===============���� �����ϱ�===============");
			
		
		
		}
		
	}

}
