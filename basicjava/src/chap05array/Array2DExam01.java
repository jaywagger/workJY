package chap05array;
/*2���� �迭 ����
1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25*/

public class Array2DExam01 {

	public static void main(String[] args) 
	{	//1.�迭 ���� �� ����
		int [][] myarry = new int [5][5];
		
		//2.for���� Ȱ���Ͽ� ���ֱ�
		
		int num=1;
		for(int j=0; j<myarry.length;j++) {
			for(int i=0; i<myarry[j].length; i++)
			{
				myarry [j][i] = num;
				num++;
			}
		}
		//3.2���� �迭�� ����� �����͸� ������¿� ���� ����ϱ�.
		for(int j=0; j<myarry.length;j++)
		{
			for(int i=0; i<myarry[j].length; i++)
			{
				System.out.print(myarry[j][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("================������===============");
		
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
