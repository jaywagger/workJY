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
		//print(); �ٸ� ������ ����Ʈ �޼ҵ带 ������ ������ ������
		//����Ʈ�� ����� ����Ʈ�� ������� ������ ����Ʈ�� ����Ʈ������ ���� �ݺ�
		//�ϱ⋚���� ������ ������. �θ��� ����Ʈ��� �����ؾ� �Ѵ�.
		super.print();
		System.out.println(" �μ�:"+getDept());
	}
	
	
	
	
	
}
