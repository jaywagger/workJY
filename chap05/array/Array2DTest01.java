package chap05.array;
//2�����迭 �ۼ� ����
public class Array2DTest01 {

	public static void main(String[] args) 
	{	//2���� �迭�� ����� ����
		int[][] myarry = new int[2][3];
		//3���� ��Ҹ� �����ִ� �迭�� �����ϴ� �迭�� ��Ұ� 2��
		
		//2�����迭�� �ʱ�ȭ
		myarry[0][0] = 100;
		myarry[1][1] = 200;
		
		
		System.out.println("myarry�� 2��° ��Ұ� �����ϴ� �迭�� 0������� ��: "
				+ ""+myarry[1][0]);
		System.out.println("myarry�� 1��° ��Ұ� �����ϴ� �迭�� 0������� ��: "
				+myarry[0][0]);
		
		//������ �迭�� ����� ����
		System.out.println("�迭�� ����=> "+myarry.length); 
		//�����迭�� �տ��� 2����
		System.out.println("myarry�� 0�� ��Ұ� �����ϴ� �迭�� ��� ����: "
		+myarry[0].length);
		System.out.println("myarry�� 1�� ��Ұ� �����ϴ� �迭�� ��� ����: "
		+myarry[1].length);
		
		//��ü �迭�� ��Ҹ� �������ϱ� - length�� ���� ���� �����ϱ�
		for(int outer=0; outer<2; outer++) 
		{//for(int outer=0; outer<myarry.length; outer++)
			for(int i=0; i<3; i++)
				//for(int i=0; i<myarry[outer].length; i++)
			{
				System.out.print(myarry[outer][i]+"\t");
			} System.out.println();
		}
		System.out.println("----------���� �� �ٸ� ���-----------");
		//��ü �迭�� ��Ҹ� �������ϱ� - length ������ �̿��ؼ� �����ϱ�
		for(int outer=0; outer<myarry.length; outer++)
		{
			for(int i=0; i<myarry[outer].length; i++)
				//myarry[outer].length =3
				//myarry[0].length = 3
				//���� ������ ������ ũ��� �� ���������� ��� ����.
			{
				System.out.print(myarry[outer][i]+"\t");
			} System.out.println();
		}
	
	
	}

}
