package chap04loop;
//for�� ��ø�ϱ� 2~9 ������
public class ForTest03 {

	public static void main(String[] args) 
	{

		for(int dan=2; dan<=9; dan++)
		{
			for(int i=1;i<=9;i++)			//������
			{
				System.out.print(+i+" x "+dan+" = " + dan*i+"\t");
			}System.out.println();
		}
	}

}
