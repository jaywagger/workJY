package chap04conditionalStatement;

import java.util.Scanner;

public class ScoreMultiifExam_T {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���: ");
		int grade = key.nextInt();
		
		if(grade > 100 | grade < 0)
		{
			System.out.println("�߸��Է�");
		}
		else if (grade >= 90)
		{
			System.out.println("A");
		}
		else if (grade >= 80)
		{
			System.out.println("B");
		}
		else if (grade >= 70)
		{
			System.out.println("C");
		}
		else if (grade >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}

	}

}
