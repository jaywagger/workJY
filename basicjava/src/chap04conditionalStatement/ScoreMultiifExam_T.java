package chap04conditionalStatement;

import java.util.Scanner;

public class ScoreMultiifExam_T {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("시험의 점수를 입력하세요: ");
		int grade = key.nextInt();
		
		if(grade > 100 | grade < 0)
		{
			System.out.println("잘못입력");
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
