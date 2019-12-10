package chap05array;
/*2차원 배열 연습
1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25*/

public class Array2DExam01 {

	public static void main(String[] args) 
	{	//1.배열 선언 및 생성
		int [][] myarry = new int [5][5];
		
		//2.for문을 활용하여 값넣기
		
		int num=1;
		for(int j=0; j<myarry.length;j++) {
			for(int i=0; i<myarry[j].length; i++)
			{
				myarry [j][i] = num;
				num++;
			}
		}
		//3.2차원 배열에 저장된 데이터를 출력형태와 같이 출력하기.
		for(int j=0; j<myarry.length;j++)
		{
			for(int i=0; i<myarry[j].length; i++)
			{
				System.out.print(myarry[j][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("================별별별===============");
		
		for(int j=0; j<myarry.length;j++)
		{
			for(int i=0; i<myarry[j].length; i++)
			{
				if(j==i) {
					System.out.print("*"+"\t");
				}else {
					System.out.print(myarry[j][i]+"\t");
				}
			}System.out.println();
			System.out.println();
		}
	}
}
