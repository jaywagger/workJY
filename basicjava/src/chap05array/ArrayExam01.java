package chap05array;
//int�� �迭 �ۼ�
//����� ����: 10
//2��, 3��, 5��: ���� 100, 200, 300
//��� ����� �� ����ϱ�
public class ArrayExam01 {

	public static void main(String[] args) 
	{
		int[] myarr = new int[10];
		myarr[2] = 100;
		myarr[3] = 200;
		myarr[5] = 300; //������ ����ֱ�
		
			
		for(int i=0; i<myarr.length;i++) 
			//�迭�� ��Ҹ�ŭ�� ������. 5��. �迭 ũ�Կ� ���ƾ� �Ѵ�.
			//�׷��� ������ �� �ִ�.
		{
			System.out.println("Array"+i+": "+myarr[i]); //10�� �� ���Ͷ�.
		}
				

	}

}
