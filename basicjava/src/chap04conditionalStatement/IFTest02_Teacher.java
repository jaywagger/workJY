package chap04conditionalStatement;
// IF�� ��ø ����
import java.util.Scanner;

public class IFTest02_Teacher {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner (System.in);
		System.out.println("���� : 1,2,3,4");
		int gender = key.nextInt();
		if(gender<1 | gender>4)
		{
			System.out.println("���ڸ� �߸��Է�");
		}
		else 
		{
			System.out.println("����");
			int age = key.nextInt();
			if(gender == 1 | gender == 3)
			{
				System.out.println("���γ���");
			}
			else
			{
				System.out.println("û�ҳⳲ��");
			}
			if(age>20)
			{
				System.out.println("���ο���");
			}
			else
			{
				System.out.println("û�ҳ⿩��");
			}
			
		}
			
		
	}

}
