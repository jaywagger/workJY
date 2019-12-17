package chap08Exception;
//사용자정의 Exception 만들기. Exception(String message)활용 예제
// 교재 439페이지
public class MyException extends Exception{
	public MyException(String msg) { //문자열을 매개변수로 받는 생성자
		super(msg);//조상인 Exception 클래스의 생정자를 호출한다.
	}
	//MyException이 발생했을 때 저장하고 싶은 정보가 있거나 처리해야 할 내용이 있는 경우
	//이걸로 구현
}
//내가 만든 오류를 JVM이 인지할 수 있도록 인위적으로 오류를 만드는 작업을 해야함.
// 명령어 throw임. throw's'랑은 다름
//예외를 인위적으로 발생시킬 때 throw 명령어를 사용함.
