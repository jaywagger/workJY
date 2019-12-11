package chap06OOPConstructor;
//생성자 연습 문제
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	
	//기본생성자도 만들어야 한다.
	public MyConstructor() {
		
	}
	
	//로그인용
	public MyConstructor(String name, String id, String pass) {
		System.out.println();
		System.out.println("매개변수가 3개 있는 생성자");
		//멤버변수=인스턴스변수=객채변수
		this.name = name;
		this.id = id;
		this.pass = pass;
		//set는 하나만 특정하게 수정할 떄 용이
	}
	
	//수정용
	public MyConstructor(String name, String id, 
								String pass, String nickname) {
		this(name,id,pass);//기존 매개변수 3개 생성자 호출
		System.out.println();
		System.out.println("매개변수 4개 생성자");
		this.nickname = nickname;;
	}
		
	//조회용
	public MyConstructor(String name, String id, 
								String pass, String nickname, String addr) {
		this(name,id,pass,nickname);
		System.out.println("매개변수 5개 생성자");
		System.out.println();
		this.addr = addr;
	}
	
	//삽입용
		public MyConstructor(String name, String id, 
									String pass, String nickname, String addr, int point) {
			this(name,id,pass,nickname,addr);
			System.out.println("매개변수 6개 생성자");
			this.point = point;
		}
	
	//Set&Get generator 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
