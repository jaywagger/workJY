package chap06OOPConstructor;
//�޼ҵ��� �Ű������� �⺻���� �������� �����ϴ� ��� ������
//å p264~8
public class CallByTest {
	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		int i = 100;
		int [] myarry = new int[5];
		for(int j=0; j<myarry.length;j++) { //100�� �迭�� �ʱ�ȭ��
			myarry[j] = 100;
		}
		System.out.println("==========change ȣ�� ��============");
		obj.display(i, myarry);
		obj.change(i, myarry);
		System.out.println("==========change ȣ�� ��============");
		obj.display(i,myarry);
		
	}
	
	public void display(int num, int[]myarry) {
		System.out.println("i = "+num);
		System.out.println("myarry�� ��� ��");
		for(int i=0; i<myarry.length;i++) {
			System.out.print(myarry[i]+"\t");
		}
		System.out.println();
	}
	//�Ű������� ���޵�  i�� myarry�� �����ϴ� �迭�� ��� ���� �����ϴ� �޼ҵ�
	public void change(int i, int []myarry) {
		i = 200;//i(100)�� 200���� �ٲ� 
		myarry[1] = 200; // 1����� �迭�� 200���� �ٲ�
	}

}
