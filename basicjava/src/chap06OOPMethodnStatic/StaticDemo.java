package chap06OOPMethodnStatic;
//static변수를 연습할 수 있는 예제
//static으로 선언한 변수는 인스턴스의 고요한 값을 저장하는 인스턴스 변수가 아니므로
//클래스명으로 접근해야 한다.

public class StaticDemo {
	String name;
	int num;
	static int staticNum;
	
	//기본 생성자
	public StaticDemo () {
		
	}
	
	public StaticDemo (String name) {
		this.name = name;
		num++;
		staticNum++;
	}
	
	public void display() {
		System.out.println("Name: "+name+",num:"+num+
				"+staticnum: "+staticNum);
	}
	
	
}
