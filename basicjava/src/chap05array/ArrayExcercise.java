package chap05array;

public class ArrayExcercise {

	public static void main(String[] args) {
		int [] myarry = new int [5]; //������ ���� ���� = �迭�� ����
		
		//�迭�� �ʱ�ȭ �۾�
		myarry[0] = 50;
		myarry[1] = 60;
		myarry[2] = 70;
		myarry[3] = 80;
		myarry[4] = 90;
		for(int i=0; i < myarry.length; i++) {
			System.out.printf("%d.myarry: %d%n", i, myarry[i]);
		
		}

	}
}
