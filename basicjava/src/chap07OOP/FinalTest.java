package chap07OOP;
//final class FinalSuper {
class FinalSuper {
	public final void display() {
		System.out.println("super display");
	}
}

class FinalSub extends FinalSuper{ //final 클래스는 상속이 불가능
	static final int NUM =100; //약속: 상수는 대문자로
}
	/*public void display() { //FinalSuper display에 final라고 정의되어
	 * 											오버라이드가 안된다
		System.out.println("display");
	}*/


public class FinalTest {
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 1000; //상수이므로 값을 수정할 수 없다.
		System.out.println(FinalSub.NUM);
		
	}

}
