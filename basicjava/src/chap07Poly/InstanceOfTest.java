package chap07Poly;
/*
		��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
		instanceof �����ڸ� �̿�
*/
class AA{
	
}
interface IA{
	
}

public class InstanceOfTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//obj�� SUperAŸ���̸� if���� �����ض�
		//�� ���� SuperA�� ������?
		if(obj instanceof SuperA){
			System.out.println("Super AŸ���̴�.");
		} else {
			System.out.println("Super AŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof InterA){
			System.out.println("Inter AŸ���̴�.");
		} else {
			System.out.println("Inter AŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		if(obj instanceof InterB){
			System.out.println("Inter BŸ���̴�.");
		} else {
			System.out.println("Inter BŸ���� �ƴϴ�.");
		}
		System.out.println("================================");
		//�ƹ��� ��Ӱ��谡 ���� Ŭ����
		if(obj instanceof IA){
			System.out.println("AIŸ���̴�.");
		} else {
			System.out.println("AIŸ���� �ƴϴ�.");
		}
	}
	

}
