package chap06OOPMethodnStatic;
//static �޼ҵ�
// 	-	static����� �����ϱ� ���� �뵵
//	-	��ƿ��Ƽó�� ���� ����ϴ� �޼ҵ�
public class StaticMethodDemo {
	//1.static �޼ҵ忡��  static�޼ҵ� �����ϱ� - �Ϲ����� ��� ����
	public static void staticTest1() {
		staticTest2();
		System.out.println("staticTest1()");
	}
	
	//2. �Ϲݸ޼ҵ忡�� �Ϲݸ޼ҵ嵵 ȣ�� ����
	public void display() {
		show();
		System.out.println("display()");
	}
	
	
	public static void staticTest2() {
		System.out.println("staticTest2");
	}
	//3. non-static���� static ȣ���غ��� (����)
	//�Ϲ� �޼ҵ忡�� �����͸� ����ϱ� ���ؼ� static �޸𸮿� ���� �ö��. �׷��� ����
	public void show() {
		System.out.println("show()");
	}
	
	public static void staticTest3() {
		//4. static�޼ҵ忡�� non-static �޼ҵ� ȣ���غ��� (�Ұ���)
		//	�Ϲ� �޼ҵ尡 �޸𸮿� ���� ������ ���� Ŭ�������� ���ǵ� �޼ҵ��
		// ������ ��ü ���� �Ŀ� ȣ���ؾ� �Ѵ�.
		//show(); �Ұ���
		StaticMethodDemo obj = new StaticMethodDemo(); //�ø��� ȣ���ؾ���
		obj.show();
		System.out.println("staticTest3");
	}

}
