package chap06OOPMethodnStatic;
//static������ ������ �� �ִ� ����
//static���� ������ ������ �ν��Ͻ��� ����� ���� �����ϴ� �ν��Ͻ� ������ �ƴϹǷ�
//Ŭ���������� �����ؾ� �Ѵ�.

public class StaticDemo {
	String name;
	int num;
	static int staticNum;
	
	//�⺻ ������
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
