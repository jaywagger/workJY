package chap06OOPMethodnStatic;

import workbook.Student;
import workbook.Student01;

//�޼ҵ��� �Ű������� ����Ÿ������ ������, �迭, �⺻�� ��� ����� �� �ִ�.
public class MethodTest {
	public static void main(String[] args) {
		Person p = new Person("Ȳ����","����",26);
		display(p.getName(), p.getAddr(), p.getAge());
		display(p);//Person��ü�� �Ű������� ������ �� �ִ�.
	}
	
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	
	public static void display(Person p) {
		System.out.println(p.toString());
	}
	//�޼ҵ带 ������ ��  �Ѱ��� ���� ������ �� �ִµ�
	//������ Ÿ���� �����͸� ������ �����ؾ� �Ѵٸ� �迭�� ����Ÿ������ �����ϰ� ����� �� �ִ�. 
	public static int[] addNumber() {
		int[] myarry = new int [3];
		//int[] myarry = {100,200,300};
		myarry[0] = 100; 
		myarry[1] = 200; 
		myarry[2] = 300; 
		return myarry;
	}
	//Ÿ���� �ٸ� �������� �����͸� �����ϰ� ���� ���: �迭�� Ÿ���� �޶� �ȉ�.(X)
	//�����ϰ� ���� ���� �����ִ� ��ü�� �����ؼ� �����ϸ� �ȴ�. 
	public static Student getInfo() {
		//student�� ��� ������ ����
		return new Student("Ȳ����",90,100,50,78);
		
	}
	
}
