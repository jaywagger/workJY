package chap06OOPMethodnStatic;
//�޼ҵ��� ȣ�� ���� 
public class MethodCallExam {
	public void test() {
		first();
	}
	public void first() {
		second();
	}
	public void second() {
		System.out.println("Second()~~~~~~~~~~~~~");
	}
	public static void main(String[] args) {
		//test(); static ������
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}

}
