package chap05.array;
//2�����迭 ����� ������ �ʱ�ȭ
public class Array2DTest03 
{

	public static void main(String[] args) 
	{	//2���� �迭���� �迭�� �����ϴ� �迩���� ��Ҹ� ���� �ٸ��� ������ �� �ִ�.
		/*int[][] myarry = new int[3][];
		myarry[0] = new int [3];
		myarry[1] = new int [2];
		myarry[2] = new int [1];*/
		int[][] myarry = {	{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15}}; 
							// int[][]= new int [3][5] ����
		
		for (int outer=0; outer<myarry.length; outer++)
		{
			for (int i=0; i<myarry[outer].length; i++)
			{
				System.out.print(myarry[outer][i]+"\t");
			}
			System.out.println();
		} //System.out.println(); ����ƴ�
		
		System.out.println("------------------------------------");
		int[][] myarry2 = {	{1,2,3},
							{6,7,8,9},
							{11,12,13,14,15}};
							// int[][]= new int [3][] ����
		
		for (int outer=0; outer<myarry2.length; outer++)
		{
			for (int i=0; i<myarry2[outer].length; i++)
			{
				System.out.print(myarry2[outer][i]+"\t");
			}
			System.out.println();
		} //System.out.println(); ����ƴ�
		
		
	}

}
