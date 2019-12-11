package chap06OOPMethodnStatic;
//static 메소드
// 	-	static멤버를 제어하기 위한 용도
//	-	유틸리티처럼 자주 사용하는 메소드
public class StaticMethodDemo {
	//1.static 메소드에서  static메소드 접근하기 - 일반적인 방법 가능
	public static void staticTest1() {
		staticTest2();
		System.out.println("staticTest1()");
	}
	
	//2. 일반메소드에서 일반메소드도 호출 가능
	public void display() {
		show();
		System.out.println("display()");
	}
	
	
	public static void staticTest2() {
		System.out.println("staticTest2");
	}
	//3. non-static에서 static 호출해보기 (가능)
	//일반 메소드에서 데이터를 사용하기 위해선 static 메모리에 먼저 올라옴. 그래서 가능
	public void show() {
		System.out.println("show()");
	}
	
	public static void staticTest3() {
		//4. static메소드에서 non-static 메소드 호출해보기 (불가능)
		//	일반 메소드가 메모리에 없기 떄문에 같은 클래스에서 정의된 메소드라도
		// 무족건 객체 생성 후에 호출해야 한다.
		//show(); 불가능
		StaticMethodDemo obj = new StaticMethodDemo(); //올리고 호출해야함
		obj.show();
		System.out.println("staticTest3");
	}

}
