package chap05array;
//�迭�� ���� ���� - ����ϴ� ���
// ������ �����Ͷ����� ���� ������ ����°� �ƴϰ� Array�� Ȱ���Ͽ� 1�� ������ ���� �����͸� �ִ´�. 
public class ArrayTest01 {
	public static void main(String[] args) 
	{
		//1. �迭�� ����
		int[] myarry;
		int[] myarry2;
		
		//2. ������ ����
		myarry = new int[5];
		System.out.println(myarry); //heap�� �Ҵ�� �ּҰ� Ȯ��
		
		myarry2 = new int[5];
		System.out.println(myarry2); //���� �ٸ� �ּҰ� ���´�.
		System.out.println("----------------------");
		
		//�ټ����� ������ �����ϴ� ���
		System.out.println("myarry�� 2�� ����� ��="+myarry[2]); //�ʱⰪ 0
		
		//3. �迭�� �ʱ�ȭ. 2�� ��ҿ� 100 �����غ���
		myarry[2] = 100;
		System.out.println("myarry�� 2�� ����� ����=>"+myarry[2]);
		
		//�迭�� ����� ������ �ѹ��� ó��
		int []newarry = new int[3];
		boolean[] booleanArr = new boolean[5];
		long[] longArr = new long[100];
		double[] doublearr = new double[100];
		
		//�迭�� �⺻ �ʱⰪ
		//�⺻���� ���
				//������: 0 
				//boolean: false
				//�Ǽ���: 0.0
		System.out.println(newarry[0]);
		System.out.println(booleanArr[0]);
		System.out.println(longArr);
		System.out.println(doublearr);

		
		
		

	}
}