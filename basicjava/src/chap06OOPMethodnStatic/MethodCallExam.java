package chap06OOPMethodnStatic;
//메소드의 호출 과정 
public class MethodCallExam {
	public void test() {
		first();
	}
	public void first() {
		second();
	}
	public void second() {
		System.out.println("Second()~~~~~~~~~~~~~");
	}
	public static void main(String[] args) {
		//test(); static 문제뜸
		MethodCallExam obj = new MethodCallExam();
		obj.test();
	}

}
