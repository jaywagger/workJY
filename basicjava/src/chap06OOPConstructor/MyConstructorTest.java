package chap06OOPConstructor;
//생성자 연습
public class MyConstructorTest {
	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor(); //인스턴스 생성. 기본생성자 생성.
		obj.setName("황제윤");//어제까지 생성자를 배우지 않아서 setter로 초기화했음
		obj.setId("Jayagerr");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","
											+obj.getPass());
		
		//매개변수가 있는 생성자 매소드를 호출하면서 값을 초기화하기
		//MyConstructor(String,String,String)이 호출됌
		MyConstructor obj2 = new MyConstructor("황제윤2","Jaywagger2","12345");
		System.out.println(obj2.getName()+","+obj2.getId()+","
		+obj2.getPass());

		MyConstructor obj3 = new MyConstructor("황제윤3","Jaywagger3","12345","4개짜리");
		System.out.println(obj3.getName()+","+obj3.getId()+","
		+obj3.getPass()+","+obj3.getNickname());

		
		MyConstructor obj4 = new MyConstructor("황제윤4","Jaywagger4","12345","4개짜리","수원");
		System.out.println(obj4.getName()+","+obj4.getId()+","
		+obj4.getPass()+","+obj4.getNickname()+","+obj4.getAddr());
		
		MyConstructor obj5 = new MyConstructor("황제윤4","Jaywagger4","12345","4개짜리","수원",11);
		System.out.println(obj5.getName()+","+obj5.getId()+","
		+obj4.getPass()+","+obj5.getNickname()+","+obj5.getAddr()+","+obj.getPoint());
	}
}
