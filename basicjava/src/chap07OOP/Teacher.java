package chap07OOP;

public class Teacher extends Person{
	private String subject;
	
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	
	//Set&Get
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println(" ����:"+getSubject());
	}
}
