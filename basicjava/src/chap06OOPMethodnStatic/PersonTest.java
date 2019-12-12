package chap06OOPMethodnStatic;
//Person클래스를 사용하는 클래스
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("황제윤","Suwon",26);
		/*p1.setName("황제윤"); //set메소드로 들어감
		p1.setAge(26); //set메소드로 들어감
		p1.setAddr("Suwon"); //set메소드로 들어감
*/		System.out.println("성명:"+p1.getName()); //set 메소드에서 get을 통해 가지고 옴
		System.out.println("주소:"+p1.getAddr());
		System.out.println("나이:"+p1.getAge());
		
		System.out.println("+++++++++++++++++++++++++");
		Person p2 = new Person("황제윤 새해","Seoul",27);
		/*p2.setName("황제윤 새해"); //set메소드로 들어감
		p2.setAge(27); //set메소드로 들어감
		p2.setAddr("Seoul"); //set메소드로 들어감
*/		
		p1.setName("황제윤"); //set메소드로 들어감
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());
	}
}