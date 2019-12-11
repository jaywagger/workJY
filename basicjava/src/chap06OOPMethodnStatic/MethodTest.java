package chap06OOPMethodnStatic;

import workbook.Student;
import workbook.Student01;

//메소드의 매개변수와 리턴타입으로 참조형, 배열, 기본형 모두 사용할 수 있다.
public class MethodTest {
	public static void main(String[] args) {
		Person p = new Person("황제윤","수원",26);
		display(p.getName(), p.getAddr(), p.getAge());
		display(p);//Person객체를 매개변수로 전달할 수 있다.
	}
	
	public static void display(String name, String addr, int age) {
		System.out.println(name+","+addr+","+age);
	}
	
	public static void display(Person p) {
		System.out.println(p.toString());
	}
	//메소드를 정의할 떄  한개의 값만 리턴할 수 있는데
	//동일한 타입의 데이터를 여러개 리턴해야 한다면 배열을 리턴타입으로 정의하고 사용할 수 있다. 
	public static int[] addNumber() {
		int[] myarry = new int [3];
		//int[] myarry = {100,200,300};
		myarry[0] = 100; 
		myarry[1] = 200; 
		myarry[2] = 300; 
		return myarry;
	}
	//타입이 다른 여러개의 데이터를 리턴하고 싶은 경우: 배열은 타입이 달라서 안됌.(X)
	//리턴하고 싶은 값을 갖고있는 객체를 생성해서 리턴하면 된다. 
	public static Student getInfo() {
		//student의 모든 정보를 리턴
		return new Student("황제윤",90,100,50,78);
		
	}
	
}
