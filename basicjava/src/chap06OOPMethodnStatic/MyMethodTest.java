package chap06OOPMethodnStatic;
//MyMethodClass���� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {
	public static void main(String[] args) {
		
		System.out.println("�޼ҵ� ȣ��1");
		MyMethod m = new MyMethod(); //�޸𸮿� �ø�. ���������
		m.display(); //MyMethod �޼ҵ� ȣ�⹮
		
		
		System.out.println("�޼ҵ� ȣ��2");
		m.display("@");//MyMethod ���� ����
		System.out.println();		
		
		System.out.println("�޼ҵ� ȣ��3");
		m.display("JY");//MyMethod ���� ����
		System.out.println();	
		
		//�Ű������� ���ϰ��� �ִ� �żҵ��� ȣ��
		int result = m.add(100, 200); 
		//�޼ҵ带 ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ���
		//���ϰ��� ������ Ÿ���� ������ �������ּž� �մϴ�.
		//�ٸ� �޼ҵ��� �Ű������� ���ٶ� �� �ִ�.
		System.out.println("�޼ҵ� ȣ�� ���: " +result);
		
		System.out.println("�޼ҵ� ȣ�� ���: " +m.add(200, 300));
		
		System.out.println("�޼ҵ� ȣ�� ���: " +m.subtr(200, 300));
		
		
	}

}
