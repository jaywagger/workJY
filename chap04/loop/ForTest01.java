package chap04.loop;
//for�� ���� - �⺻ for ����(for���� ����)
public class ForTest01 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		int count=1;
		for(int i=1; i<5;i++)
			{
			System.out.println(i+". �ڹ����α׷���:");//+count/
			//count++;
			}
		
		System.out.println("***********************************");
		for(int i=11; i<25;i++)
		{
		System.out.println("�ڹ����α׷���");
		}
		
		System.out.println("***********************************");
		for(int i=5; i>1;i--) //���ǿ� ���� --�� ����� �� �ִ�.
							  //�ʱⰪ(���۰�)�� ��� �뵵�� ���� ���� 
		{
		System.out.println("�ڹ����α׷���");
		}
	
	}
}
