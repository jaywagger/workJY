package chap04.ConditionalStatement;
//swtich�������� �������
import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) 
	{
		//switch�� ���ǹ��� int�� casting�� �� �ִ� ���� ��� �ִ� ����, �����, �޼ҵ�
		double d = 1.5;
		//���𿡼� double�� ����� �� ����. int�� str�� Ȱ���ض�
		// byte, short, int, char, string ��� ����.
		
		int data=5;		
		switch(data+60) // ������ �� �ִ�.
		{
			case 'A': //ascii �ڵ嵵 ����� �� �ִ�. A�� ������� �ʾ���. 
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
		}
		
		//String�� ����
		String code = new String("a01");
		switch(code)
		{
		case "a01": 
			System.out.println("A01");
			break;
		case "a02":
			System.out.println("A02");
			break;
		case "a03":
			System.out.println("A03");
		
		}

	}

}
