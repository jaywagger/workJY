package chap09APILang;

import java.util.Date;
import java.util.Random;

//Object Ŭ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����
public class Object01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //Ŭ������ ������ �����ϴ� �޼���
		System.out.println(obj1.hashCode()); //����μ��� ��ü ������ ���� ���ϵȴ�.
		System.out.println(obj1.toString()); //��ü�� �ּҰ� ���ϵȴ�. - �⺻�޼���
		System.out.println(obj1); // �⺻�޼���� ������ �����ϴ�.
		
		Person p1 = new Person("Ȳ����",26,"����");
		System.out.println(p1.toString());
		System.out.println(p1);
		
		
		//API�� Ŭ������...
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
		
		
		
		
		
		
	}

}
