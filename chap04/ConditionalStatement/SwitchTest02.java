package chap04.ConditionalStatement;

import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���: ");
		int ssn = key.nextInt();
			
		switch (ssn) 
		{
			case 1: case 3: //�ߺ��Ǵ� �ڵ�� �̷��� ��ĥ �� �ִ�.
							//�� Ư���� Ȱ���Ͽ� �ݺ����� �ڵ带 ���� �� �ִ�.
				System.out.println("����");
				break; 
			case 2: case 4:
				System.out.println("����");
				break;
			default: 
				System.out.println("�߸��Է�");		
		}

	}

}
