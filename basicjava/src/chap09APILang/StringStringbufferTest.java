package chap09APILang;
//String �� Stringbuffer�� ���ɺ�
public class StringStringbufferTest {
	//String�� �۾��� üũ�ϴ� �޼���
	public static void stringCheck(int count) {
		//������ �� �ð��� ���� -nano��
		long start = System.nanoTime();//10 ����� 1��		
		String str = new String("�ڹ�");
		for(int i=0; i<=count;i++) {
			str = str+"java";
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str=str+java");
		System.out.println("�ɸ��ð�:" +time);
		System.out.println();
	}
	//Stringbuffer�� �۾��� üũ�ϴ� �޼���
	public static void stringBufferCheck(int count) {
		//������ �� �ð��� ���� -nano��
		long start = System.nanoTime();//10 ����� 1��		
		StringBuffer sb = new StringBuffer("�ڹ�");
		for(int i=0; i<=count;i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")");
		System.out.println("�ɸ��ð�:" +time);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("����Ƚ��: "+count);
		System.out.println();
		stringCheck(count);
		stringBufferCheck(count);
	}
//����: �ϴ� ������ �ƴ� ���� ������ Ȱ���ϴ� ����.
	//String Ŭ������ Stringbuffer Ŭ������ ���ϹǷ� ������ ������ ����. 
}
