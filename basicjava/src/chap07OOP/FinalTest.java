package chap07OOP;
//final class FinalSuper {
class FinalSuper {
	public final void display() {
		System.out.println("super display");
	}
}

class FinalSub extends FinalSuper{ //final Ŭ������ ����� �Ұ���
	static final int NUM =100; //���: ����� �빮�ڷ�
}
	/*public void display() { //FinalSuper display�� final��� ���ǵǾ�
	 * 											�������̵尡 �ȵȴ�
		System.out.println("display");
	}*/


public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000; //����̹Ƿ� ���� ������ �� ����.
		System.out.println(FinalSub.NUM);
		
	}

}
