package chap07Poly;
//��ü�� ����ȯ: ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.
class Parent{
	String name = "Ȳ����";
	public void display() {
		System.out.println("�θ��� display");
	}
}

class Child extends Parent{
	String name = "�̹�ȣ";
	public void display() {
		System.out.println("�ڽ��� display");
	}
	public void test() {
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}
/*class Child2 extends Parent{ //child1 �� child2 �� ��Ӱ��谡 �ƴϴ�.
							//�׷��Ƿ� casting�� �ȉ�. �׷� casting��???
}*/

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1.super Ÿ���� ���������� super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name); //�θ��� �̸�: Ȳ���� ȣ��
		System.out.println("==============================");
		
		System.out.println("2.subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name); //�����ǵ� �޼ҵ尡 ���. �θ�x
		System.out.println("==============================");
		
		/* ��ü�� ����ȯ
		 * - ������ ��������Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü�� ����
		
		*/
		System.out.println("��ü�� ����ȯ");
		System.out.println("3.superŸ���� ���������� sub��ü�� ����");
		Parent obj3 = new Child(); //�ڵ�����ȯ
		obj3.display(); //�ڽ��� �������̵��� ������ ��������
		System.out.println(obj3.name); //������ �θ��� ��Ӻ��� Ȳ������ ȣ���
		System.out.println("==============================");
		//Ÿ���� ParentŸ�������� ������ ������ ��ü�� Child ī���̱� ������
		//Child Ÿ������ ����ȯ�� �����ϴ� (�����)
		((Child)obj3).test();
		System.out.println("==============================");
		//System.out.println("4.subŸ���� ���������� super��ü�� ����(3���ݴ�)");
		//Child obj4 = new Parent(); //child�� ������. �ڽľȿ� �θ�����. 
								//�������� �����ϸ� ���� ����. �ڽ��� �θ�����
								//�θ� �ڽ��� �ƴ�
		
		System.out.println("=============================");
		System.out.println("5. subŸ���� ��������= " +
							"superŸ���� ��������(super��ü�� ����)---X");
		//��������� ����ȯ�� �Ͽ� �����Ϸ��� �ӿ����� ���������
		//ĳ������ �Ϸ��� �� ��
		// Child obj5 =(Child)obj1;\X
		System.out.println("=============================");
		System.out.println("6. subŸ���� ��������= " +
				"superŸ���� ��������(super��ü�� ����)---X");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		System.out.println("===============1=============");
		Parent obj7 = obj2;
		
		Parent obj8 = null; //������ car ����
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8=obj9; //super Ÿ�� = sub Ÿ��
		//obj10 = obj8; �ȉ�
		obj10 = (Child)obj8;
		
		//ĳ������ �� �� �ִٴ� ���� 
		
	}

}
