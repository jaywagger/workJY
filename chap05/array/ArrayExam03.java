package chap05.array;
//��� Ȧ����° �ε����� ���� ���ϱ�
public class ArrayExam03 {

	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int oddSum=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if (i%2==1 ) //arr[i]%2==1 �ƴϰ�
			{	
				System.out.println(i+"."+"Ȧ�� �迭: "+arr[i]);
				oddSum += arr[i]; 
			}
						 
		}System.out.println("�迭�� Ȧ�� ��° ������ ����: "+oddSum);
	}

}
