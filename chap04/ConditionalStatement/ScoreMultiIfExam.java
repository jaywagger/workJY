package chap04.ConditionalStatement;

import java.util.Scanner;

public class ScoreMultiIfExam {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���: ");
		int grade = key.nextInt();
		
		if(grade >= 90 & grade <= 100)
		{
			System.out.println("A");
		}
		else if (grade >= 80 & grade <= 89)
		{
			System.out.println("B");
		}
		else if (grade >= 70 & grade <= 79)
		{
			System.out.println("C");
		}
		else if (grade >= 60 & grade <= 69)
		{
			System.out.println("D");
		}
		else if (grade >= 0 & grade <= 59)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("�߸��Է�");
		}

	}

}
