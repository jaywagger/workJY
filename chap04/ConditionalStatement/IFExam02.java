package chap04.ConditionalStatement;

import java.util.Scanner;
//숫자를 입려받아서 음수인지 양수인지 출력하고
//단, 양수인 경우 짝수인지 홀수인지 출력하기. 0은 제외

public class IFExam02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("당신의 성함을 입력하세요: ");
		String name = key.next();
		System.out.println("안녕하세요 "+name+"님");
		System.out.println();

		System.out.println(name+"님의 성별을 입력하세요: 1,3 남성 2,4 여성");
		int sex = key.nextInt();
		System.out.println(name+"님의 나이를 입력하세요");
		int num = key.nextInt();
		
		if (sex == 1 || sex == 3)
		{
			System.out.println(name+"님의 성별은 남성입니다.");
			if(num >= 20)
			{
				
				System.out.println(name+"님은 성인입니다.");	
				}
				else 
				{
					System.out.println(name+"님은 청소년입니다.");
				}
		}
		
		else
		{
			System.out.println(name+"님의 성별은 여성입니다.");
			if(num >= 20)
			{
				System.out.println(name+"님은 성인입니다.");
			}
			
			else 
			{
				System.out.println(name+"님은 청소년입니다.");

			}	
		}


	}

}
