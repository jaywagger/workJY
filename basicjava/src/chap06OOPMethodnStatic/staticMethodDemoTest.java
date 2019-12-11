package chap06OOPMethodnStatic;

import java.util.Random;

public class staticMethodDemoTest {
	public static void main(String[] args) {
		//API의 static 메소드 접근하기
		//=> static멤버는 인스턴스의소유가 아니므로 무족건 클래스명으로 접근한다.
		System.out.println(Math.PI); //static 메소드의 호출
		System.out.println(Math.random()); //일반 메소드(인스턴스메소드)의 호출
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
	}
}
