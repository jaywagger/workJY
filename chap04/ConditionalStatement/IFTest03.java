package chap04.ConditionalStatement;

import java.util.Random;
import java.util.Scanner;
//if-else ���� ��ĳ���� Ȱ��

public class IFTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ���:");
		String name = key.next();
		System.out.println();
		
		System.out.println(name+"���� ���� ������ �Է��ϼ���:");
		int num = key.nextInt();
		System.out.println();
		System.out.println(name+"�� ����:"+num);
		System.out.println();
	
		System.out.println(name+"�� ���� Ƚ���� �Է��ϼ���:");
		int fre = key.nextInt();
		System.out.println();
		System.out.println(name+"�� ����Ƚ��:"+fre);
		System.out.println();
		
		if(num>=90)
		{
			System.out.println();
			System.out.println("���");
		}
		else 
		{
			if(fre>=3)
			{
				System.out.println("ó������ �ٽ� ����");
				System.out.println();
			}
			else
			{
				System.out.println("�� ���� �����^^");	
				System.out.println();
			}
			
		}
		
	}

}
