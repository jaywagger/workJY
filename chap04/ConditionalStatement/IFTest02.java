package chap04.ConditionalStatement;

import java.util.Random;
import java.util.Scanner;
//if-else ���� ��ĳ���� Ȱ��

public class IFTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ���:");
		String name = key.next();
		System.out.println();
		
		System.out.println("����� ������ �Է��ϼ���:");
		int num = key.nextInt();
		System.out.println();
		System.out.println(name+"�� ����:"+num);
	
		if(num>=90)
		{
			System.out.println();
			System.out.println("���");
		}
		else 
		{
			System.out.println();
			System.out.println("�����");
		}
		
	}

}
