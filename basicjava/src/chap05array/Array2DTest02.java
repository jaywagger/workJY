package chap05array;
//2차원배열 선언과 생성
public class Array2DTest02 
{

	public static void main(String[] args) 
	{	//2차원 배열부터 배열이 참조하는 배열이 요소를 각각 다르게 정리할 수 있다.
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
		} //System.out.println(); 여기아님
		
	}

}
