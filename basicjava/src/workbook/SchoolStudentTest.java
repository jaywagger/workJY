package workbook;

public class SchoolStudentTest {

	public static void main(String[] args) {
		
		SchoolStudent studentArray [] = new SchoolStudent[3]; //�迭 ����
		studentArray [0] = new SchoolStudent("ȫ�浿", //�ν��Ͻ� ����
										15, 171, 81);
		studentArray [1] = new SchoolStudent("�ѻ��", //�ν��Ͻ� ����
										13, 183, 72);
		studentArray [2] = new SchoolStudent("�Ӱ���", //�ν��Ͻ� ����
										16, 175, 65);
		
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"������");
		// sum �迭
		//int sum = 0 �ϳ���
		int sum[] = new int[3]; //�迭�� ���
		double ave[] = new double[3];
		for(int i=0; i<studentArray.length;i++) { //�迭 �ʱ�ȭ
			studentArray[i].show();
			// sum = sum+studentArray [i].getAge();
			sum[0] = sum[0] + studentArray [i].getAge();
			sum[1] = sum[1] + studentArray [i].getHeight();
			sum[2] = sum[2] + studentArray [i].getWeight();
			
		}
		System.out.println(ave [0] = sum[0]/studentArray.length);
		/*System.out.println("������ ���: "+ave [1] = sum[1]/studentArray.length);
		System.out.println("�������� ���: "+ave [2] = sum[2]/studentArray.length);
		*/
		//�̰� Ȱ���ϸ� �迭�� �����͸� ������ �� �ִ�
		//System.out.println(studentArray [0].getAge());		
		
		
;
	}
}
