package chap07Poly;
//객체의 형변환: 상속관계에 있는 경우에만 가능하다.
class Parent{
	String name = "황제윤";
	public void display() {
		System.out.println("부모의 display");
	}
}

class Child extends Parent{
	String name = "이민호";
	public void display() {
		System.out.println("자식의 display");
	}
	public void test() {
		System.out.println("하위클래스에만 정의된 메소드");
	}
}
/*class Child2 extends Parent{ //child1 과 child2 는 상속관계가 아니다.
							//그러므로 casting이 안됌. 그럼 casting은???
}*/

public class RefCastingTest {
	public static void main(String[] args) {
		System.out.println("1.super 타입의 참조변수로 super객체를 참조");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name); //부모의 이름: 황제윤 호출
		System.out.println("==============================");
		
		System.out.println("2.sub타입의 참조변수로 sub객체를 참조");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name); //재정의된 메소드가 출력. 부모x
		System.out.println("==============================");
		
		/* 객체의 형변환
		 * - 변수는 참조변수타입에 따라서 결정, 메소드는 생성되는 객체가 기준
		
		*/
		System.out.println("객체의 형변환");
		System.out.println("3.super타입의 참조변수로 sub객체를 참조");
		Parent obj3 = new Child(); //자동형변환
		obj3.display(); //자식의 오버라이딩된 변수가 나왔지만
		System.out.println(obj3.name); //변수는 부모의 멤머변수 황제윤이 호출됌
		System.out.println("==============================");
		//타입이 Parent타입이지만 실제로 생성된 객체가 Child 카입이기 때문에
		//Child 타입으로 형변환이 가능하다 (명시적)
		((Child)obj3).test();
		System.out.println("==============================");
		//System.out.println("4.sub타입의 참조변수로 super객체를 참조(3번반대)");
		//Child obj4 = new Parent(); //child가 기준임. 자식안에 부모가있음. 
								//집합으로 생각하면 이해 쉬움. 자식이 부모지만
								//부모가 자식이 아님
		
		System.out.println("=============================");
		System.out.println("5. sub타입의 참조변소= " +
							"super타입의 참조변소(super객체를 참조)---X");
		//명시적으로 형변환을 하여 컴파일러는 속였으니 실행시점에
		//캐스팅을 하려고 할 때
		// Child obj5 =(Child)obj1;\X
		System.out.println("=============================");
		System.out.println("6. sub타입의 참조변소= " +
				"super타입의 참조변소(super객체를 참조)---X");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		
		System.out.println("===============1=============");
		Parent obj7 = obj2;
		
		Parent obj8 = null; //교재의 car 변수
		Child obj9 = new Child(); //fe
		Child obj10 = null; //fe2
		
		obj8=obj9; //super 타입 = sub 타입
		//obj10 = obj8; 안됌
		obj10 = (Child)obj8;
		
		//캐스팅을 할 수 있다는 것은 
		
	}

}
