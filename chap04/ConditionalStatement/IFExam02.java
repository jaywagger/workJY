package chap04.ConditionalStatement;

import java.util.Scanner;
//���ڸ� �Է��޾Ƽ� �������� ������� ����ϰ�
//��, ����� ��� ¦������ Ȧ������ ����ϱ�. 0�� ����

public class IFExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ���: ");
		String name = key.next();
		System.out.println("�ȳ��ϼ��� "+name+"��");
		System.out.println();

		System.out.println(name+"���� ������ �Է��ϼ���: 1,3 ���� 2,4 ����");
		int sex = key.nextInt();
		System.out.println(name+"���� ���̸� �Է��ϼ���");
		int num = key.nextInt();
		
		if (sex == 1 || sex == 3)
		{
			System.out.println(name+"���� ������ �����Դϴ�.");
			if(num >= 20)
			{
				
				System.out.println(name+"���� �����Դϴ�.");	
				}
				else 
				{
					System.out.println(name+"���� û�ҳ��Դϴ�.");
				}
		}
		
		else
		{
			System.out.println(name+"���� ������ �����Դϴ�.");
			if(num >= 20)
			{
				System.out.println(name+"���� �����Դϴ�.");
			}
			
			else 
			{
				System.out.println(name+"���� û�ҳ��Դϴ�.");

			}	
		}


	}

}
