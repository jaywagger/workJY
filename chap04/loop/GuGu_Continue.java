package chap04.loop;

public class GuGu_Continue {
//continue Ȱ��, �ݺ��������� ������ �����ϴ�. P.176
	public static void main(String[] args) 
	{
		for(int dan=2; dan<=9; dan++)
		{
			if(dan==5)
			{
				continue;
			}
			for(int i=1; i<=9; i++)
			{
				//if(dan==5) { break���� ���� for�� ����Ǿ� �����Ƿ�
				// break; �ݺ����� ��������� �ʴ´�.}
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}

	}

}
