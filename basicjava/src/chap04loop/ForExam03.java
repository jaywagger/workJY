package chap04loop;

public class ForExam03 
{

	public static void main(String[] args) 
	{
		System.out.println("1 to 100������ ��");
		System.out.println();

		int sum1=0; //for���� �ʱⰪ�� ����������Ѵ�
		int sum2=0;
		int sum3=0;	
		
		for(int i=1; i<=100; i++)
		{
			sum1+=i; // sum1 = sum1+i
			
			if(i%2==0) // ¦��
			{
				sum2+= i;
			}
			else
			{
				sum3+=i;
			}
			
//			if(i%2==1) //Ȧ��           // ���� �ϳ��̹Ƿ� if-else�� ����ϴ°� ����.
//			{
//				sum3+= i;
//			}		
		}
		
		System.out.println("��� ���� ��: "+sum1);
		System.out.println();
		
		System.out.println("¦���� ��: "+sum2);
		System.out.println();
		
		System.out.println("Ȧ���� ��: "+sum3);
		System.out.println();
	}	
}
