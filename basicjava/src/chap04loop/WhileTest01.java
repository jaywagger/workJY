package chap04loop;
//���� while�� ����
//�ڹ� ���α׷��� 5�� ���
public class WhileTest01 {

	public static void main(String[] args) 
	{
		int i=1;
		while(i<=5)
		{
			System.out.println(i+". �ڹ����α׷���");
			i++; 
		}
		System.out.println("---------------------------------");
		
		i=1; //�� �ڵ勚���� i=5 �̹Ƿ�, �ʱ�ȭ�Ѵ�.
		while(true)
		{
			if(i>5)
			{
				//�ݺ����� ��������
				break;
			}
			System.out.println(i+". �ڹ����α׷���");
			i++;
		}
		
		
		
	}

}
