package chap05array;
//2�����迭 ����� ����
public class Array2DTest02 
{

	public static void main(String[] args) 
	{	//2���� �迭���� �迭�� �����ϴ� �迭�� ��Ҹ� ���� �ٸ��� ������ �� �ִ�.
		int[][] myarry = new int[3][];
		myarry[0] = new int [3];
		myarry[1] = new int [2];
		myarry[2] = new int [1];
		
		for (int outer=0; outer<myarry.length; outer++)
		{
			for (int i=0; i<myarry[outer].length; i++)
			{
				System.out.print(myarry[outer][i]);
			}
			System.out.println();
		} //System.out.println(); ����ƴ�
		
	}

}
