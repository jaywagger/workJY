package chap07OOP;

public class Staff extends Person{
	private String dept;
	
	//Set&Get
	
	
	public Staff() {
		
	}
	public Staff(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	
	public void print() {
		//print(); 다른 파일의 프린트 메소드를 가지고 오려고 했지만
		//프린트는 가까운 프린트를 끌어오기 때문에 프린트를 프린트내에서 무한 반복
		//하기떄문에 오류가 나왔음. 부모의 프린트라고 선언해야 한다.
		super.print();
		System.out.println(" 부서:"+getDept());
	}
	
	
	
	
	
}
