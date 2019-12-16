package chap07Poly;
/*
	인터페이스 연습
	<<인터페이스>>
	=> 추상메소드 (상수도 포함)만 정의하는 특별한 클래스
	1. 인터페이스는 interface키워드를 이용해서 정의
	2. 인터페이스는 추상메소드만 정의하는 특별한 클래스
		- public abstract이 생략가능
		- 상속을 받으면 자동으로 추가한다.
	3. 인터페이스가 인터페이스를 상속할 수 있다. (extends이용)
		- 하위가 상위 인터페이스의 추상메소드를 상속받는다.
	4. 클래스가 인터페이스를 상속할 수 있다. (implements 이용)
		- 인터페이스를 상속받는 클래스가 이미 다른 클래스를 상속하는 경우에
		extends를 먼저 정의하고 implements를 정의해야 한다. (순서대로)
	5. 인터페이스는 다중상속이 가능하다. implements 위에서 인터페이스를 정의할 떄
		','로 구분하여 나열.
	6. 클래스와 인터페이스를 상속받는 하위클래스는 모든 클래스와 인터페이스의 하위로 인식된다.
*/
//인터페이스 상위클래스
interface InterA{
	public abstract void test(); // 인터페이스는 어차피 추상만 취급. 생략가능
	void display(int num);
}
//인터페이스 하위클래스
interface InterB extends InterA{
	void show();
}
interface InterC {
	
}
class SuperA{
	
}
					//B가 A를 상속중
//SubA는 SuperA,InterA,InterB,InterC의 하위가 된다.
class SubA extends SuperA implements InterB, InterC{ 
				//A에서 2개, B에서 1개 추상메서드 총 3개 오버라이드 해야 함.

	@Override
	public void test() {
		
	}

	@Override
	public void display(int num) {
		
	}

	@Override
	public void show() {
		
	}
	
}





public class InterfaceTest01 {

	public static void main(String[] args) {
		SuperA obj1 = new SubA(); // 부모타입이니 가능
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();// SubA은 모른 클래스의 하위클래
	}

}
