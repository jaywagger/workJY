package chap07OOP;
//��� Parent
public class Person {
	String name;
	int age;
	public Person() {	
	}
	
	//Set&Get
	public String getName() {
		return name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.print("����: "+getName() +" ����:"+getAge());	
	}
	
	
	

}



