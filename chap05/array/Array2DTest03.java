package chap05.array;
//2차원배열 선언과 생성과 초기화
public class Array2DTest03 
{

	public static void main(String[] args) 
	{	//2차원 배열부터 배열이 참조하는 배여르이 요소를 각각 다르게 정리할 수 있다.
		/*int[][] myarry = new int[3][];
		myarry[0] = new int [3];
		myarry[1] = new int [2];
		myarry[2] = new int [1];*/
		int[][] myarry = {	{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15}}; 
							// int[][]= new int [3][5] 동일
		
		for (int outer=0; outer<myarry.length; outer++)
		{
			for (int i=0; i<myarry[outer].length; i++)
			{
				System.out.print(myarry[outer][i]+"\t");
			}
			System.out.println();
		} //System.out.println(); 여기아님
		
		System.out.println("------------------------------------");
		int[][] myarry2 = {	{1,2,3},
							{6,7,8,9},
							{11,12,13,14,15}};
							// int[][]= new int [3][] 동일
		
		for (int outer=0; outer<myarry2.length; outer++)
		{
			for (int i=0; i<myarry2[outer].length; i++)
			{
				System.out.print(myarry2[outer][i]+"\t");
			}
			System.out.println();
		} //System.out.println(); 여기아님
		
		
	}

}
