package chap09APILang;

import java.util.Date;
import java.util.Random;

//Object 클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스
public class Object01 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); //클래스의 정보를 리턴하는 메서드
		System.out.println(obj1.hashCode()); //현재로서는 객체 정보의 값이 리턴된다.
		System.out.println(obj1.toString()); //객체의 주소가 리턴된다. - 기본메서드
		System.out.println(obj1); // 기본메서드는 생략이 가능하다.
		
		Person p1 = new Person("황제윤",26,"수원");
		System.out.println(p1.toString());
		System.out.println(p1);
		
		
		//API의 클래스들...
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
		
		
		
		
		
		
	}

}
