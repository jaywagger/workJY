package chap04.loop;

public class ForExam03 
{

	public static void main(String[] args) 
	{
		System.out.println("1 to 100까지의 수");
		System.out.println();

		int sum1=0; //for문은 초기값을 설정해줘야한다
		int sum2=0;
		int sum3=0;	
		
		for(int i=1; i<=100; i++)
		{
			sum1+=i; // sum1 = sum1+i
			
			if(i%2==0) // 짝수
			{
				sum2+= i;
			}
			else
			{
				sum3+=i;
			}
			
//			if(i%2==1) //홀수           // 둘중 하나이므로 if-else로 사용하는게 좋다.
//			{
//				sum3+= i;
//			}		
		}
		
		System.out.println("모든 수의 합: "+sum1);
		System.out.println();
		
		System.out.println("짝수의 합: "+sum2);
		System.out.println();
		
		System.out.println("홀수의 합: "+sum3);
		System.out.println();
	}	
}
