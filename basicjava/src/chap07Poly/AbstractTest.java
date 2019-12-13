package chap07Poly;
//추상클래스 - abstract의 의미 p.375
/*
		미완성된 클래스, 모든 내용이 구현이 되어있지 않은 클래스로 완성되지 않았아
		객체생성을 할 수 없다.---------------
						메소드의 body가 구현되지 않은 메소드를 
						갖고 있는 클래스(추상메소드)
						
						
1. 추상메소드를 선언하는 방법: 컴파일러에게 추상클래스라고 알리기 위해 Abstract를 기재함
	접근제어자 리턴타입 메소드명(매개변수 list....){메소드body가 없음}
	=> 추상메소드가 정의된 클래스는 미완성된 추상클래스가 되므로
		일반클래스와 다르다. 따라서 추상클래스를 정의하는 경우 클래스 선언부에도
		abstract를 추가해야 합니다.
		
	메소드 바디가 없는 메소드는 추상메소드. abstract를 붙여야 일반과 다름. 
	
2. 추상클래스의 특징
	-  일반메소드와 추상메소드 모두 정의할 수 있다.
	- 추상메소드가 한 개라도 정의되어 있는 클래스는 반드시 abstract를 추가해야 한다.
	- 추상클래스는 인스턴스화 즉 인스턴스를 만들 수 없다. 객체생성불가능
	- 추상클래스(Abstract클래스)를 상속하면 에러가 발생한다.
	=> AbstractSub 클래스가 Abstract메소드를 갖고 있는 AbstractSuper 클래스가
	상속하면서 AsbtractSub클래스도 추상클래스로 변경됌.
	
	해결방법:
	1. 상위클래스(Parent class)로 사용할 목적으로 만들어진 클래스라면 클래스 선언부에 
		abstract 추가한다.
	2. 모든 추상메소드를 반드시 오버라이딩해야 한다.
	
3. 추상클래스와 추상메소드를 작성하는 이유: 다형성을 적용하기 위해서
	1. 상위클래스로 사용하기 위한 목적(객체생성을 문법적으로 제한하기 위해)
	2. 하위클래스에서 반드시 재정의해야하는 메소드를 문법으로 정의하여 반드시 재정의하도록
		하기 위해서
	3. 다형성을 적용하기 위해서 (가장큰 목적). 추상클래스를 안 쓰면 다형성을 쓸 수 없음.
						
*/
abstract class AbstractSuper{
	public abstract void show();
	public void display() {//일반메소드
		System.out.println("display");
	}
}

/*class AbstractSub extends AbstractSuper{ //상속받는 동시에 이 클래스도 추상화됌
										// 굳히 계속 다 추상화하는 것은 의미가 없다.
}*/
class AbstractSub extends AbstractSuper{

	@Override
	public void show() {
		// TODO Auto-generated me	thod stub
		
	} 
}

public class AbstractTest {
	public static void main(String[] args) {
		//AbstractSuper obj = new AbstractSuper(); //인스턴스화 할 수 없다는 뜻
	}

}
