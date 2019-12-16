package chap07Poly;
/*
		객체의 타입을 검사하고 작업할 수 있다.
		instanceof 연산자를 이용
*/
class AA{
	
}
interface IA{
	
}

public class InstanceOfTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//obj가 SUperA타입이면 if블럭을 실행해라
		//이 뜻은 SuperA의 하위냐?
		if(obj instanceof SuperA){
			System.out.println("Super A타입이다.");
		} else {
			System.out.println("Super A타입이 아니다.");
		}
		System.out.println("================================");
		if(obj instanceof InterA){
			System.out.println("Inter A타입이다.");
		} else {
			System.out.println("Inter A타입이 아니다.");
		}
		System.out.println("================================");
		if(obj instanceof InterB){
			System.out.println("Inter B타입이다.");
		} else {
			System.out.println("Inter B타입이 아니다.");
		}
		System.out.println("================================");
		//아무런 상속관계가 없는 클래스
		if(obj instanceof IA){
			System.out.println("AI타입이다.");
		} else {
			System.out.println("AI타입이 아니다.");
		}
	}
	

}
