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
		for(int i=0; i<studentArray.length;i++) { //�迭 �ʱ�ȭ
			studentArray[i].show();
		}
		
		
		
		System.out.println("������ ���: "+ageAve);
		System.out.println("������ ���: "+heightAve);
		System.out.println("�������� ���: "+WeightAve);
	}
}
