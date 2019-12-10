package chap06method;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false로 초기화된다
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//	public
//	default
//	protected
//	private

/*클래스를 정의할 떄 멤버변수는 private으로 선언해서 외부에서 접근할 수 있도록
정보를 은닉하여 public 메소드를 통해서 접근할 수 있도록 구현한다.*/
public class Person {
		private String name;//클래스의 특성을 나타내는 데이터 - 멤버변수
		private String addr;//멤버변수는 특별한 상황이 아니면 초기값을 주지 않는다
		private int age;//기본형, 참조형, 자바에서 쓰는 모든 데이터타입으로 멤버변수 타입가능

		//모든 멤버변수는 private으로 선언되어 있기 떄문에 값을 설정/변경하는 매소드와
		//값을 가져올 수 있는 메소가 필요하다.
		//이런 역할을 하는 메소르를 정의하는 경우
		
		//name 변수의 값을 설정하는 메소드
		//메소드명: set을 붙히고: set + 멤버변수명, 단 첫번째는 대문자.
		//			setName
		//set 리턴값이 없으므로 void다
		
		//이름을 변경하는 기능의 메소드
		public void setName(String name) { //문자를 받기 때문에 String
			//java 스펙에 명시된 약속
			//변수를 설명 또는 변경할 때 set+대문자
			//set은 바꾸기만 하기때문에 return값 없음. void
			//매개변수에서 값을 넘겨주기 때문에 리턴있음
			this.name = name;
			//(this)멤버변수 = 지역변수. //name = name; 지역변수 = 지역변수
		}

		//name 변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
		//메소드명: get + 멤버변수명(첫 글자 대문자)
		// getName
		//값을 넘겨줘야 하기 때문에 리턴값이 있다. 리턴시 타입을 명시하고 리턴값 타입도 명시
		public String getName() { //getter method
			return this.name;
			
		}
		
		//Addr private 접근 메소드: Set
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		//Addr private 접근 메소드: Set
		public String getAddr() {
			return this.addr;
		}
	
		
		//Age private 접근 메소드: Set
		public void setAge(int age ) {
			this.age = age;
		}
		//Age private 접근 메소: Get
		public int getAge() {
			return this.age;
		}
		
	

}
