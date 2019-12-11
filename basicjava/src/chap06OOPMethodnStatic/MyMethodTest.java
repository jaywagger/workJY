package chap06OOPMethodnStatic;
//MyMethodClass에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		
		System.out.println("메소드 호출1");
		MyMethod m = new MyMethod(); //메모리에 올림. 선언과생성
		m.display(); //MyMethod 메소드 호출문
		
		
		System.out.println("메소드 호출2");
		m.display("@");//MyMethod 내용 변경
		System.out.println();		
		
		System.out.println("메소드 호출3");
		m.display("JY");//MyMethod 내용 변경
		System.out.println();	
		
		//매개변수와 리턴값이 있는 매소드의 호출
		int result = m.add(100, 200); 
		//메소드를 호출하는 경우 리턴값이 존재하는 메소드라면
		//리턴값과 동일한 타입의 변수를 선업해주셔야 합니다.
		//다른 메소드의 매개변수로 전다랄 수 있다.
		System.out.println("메소드 호출 결과: " +result);
		
		System.out.println("메소드 호출 결과: " +m.add(200, 300));
		
		System.out.println("메소드 호출 결과: " +m.subtr(200, 300));
		
		
	}

}
