package chap06OOPMethodnStatic;
//StaticDemo�� �׽�Ʈ�ϴ� Ŭ����
public class staticDemoTest {

	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo("obj1");
		obj1.display();
		System.out.println(obj1.num+","+obj1.staticNum);
		
		StaticDemo obj2 = new StaticDemo("obj1");
		obj2.display();
		System.out.println(obj2.num+","+obj2.staticNum);
		
		StaticDemo obj3 = new StaticDemo("obj1");
		obj3.display();
		System.out.println(obj3.num+","+obj3.staticNum);
		
	}

}
