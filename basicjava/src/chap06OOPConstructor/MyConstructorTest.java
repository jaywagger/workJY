package chap06OOPConstructor;
//������ ����
public class MyConstructorTest {
	public static void main(String[] args) {
		
		MyConstructor obj = new MyConstructor(); //�ν��Ͻ� ����. �⺻������ ����.
		obj.setName("Ȳ����");//�������� �����ڸ� ����� �ʾƼ� setter�� �ʱ�ȭ����
		obj.setId("Jayagerr");
		obj.setPass("1234");
		System.out.println(obj.getName()+","+obj.getId()+","
											+obj.getPass());
		
		//�Ű������� �ִ� ������ �żҵ带 ȣ���ϸ鼭 ���� �ʱ�ȭ�ϱ�
		//MyConstructor(String,String,String)�� ȣ���
		MyConstructor obj2 = new MyConstructor("Ȳ����2","Jaywagger2","12345");
		System.out.println(obj2.getName()+","+obj2.getId()+","
		+obj2.getPass());

		MyConstructor obj3 = new MyConstructor("Ȳ����3","Jaywagger3","12345","4��¥��");
		System.out.println(obj3.getName()+","+obj3.getId()+","
		+obj3.getPass()+","+obj3.getNickname());

		
		MyConstructor obj4 = new MyConstructor("Ȳ����4","Jaywagger4","12345","4��¥��","����");
		System.out.println(obj4.getName()+","+obj4.getId()+","
		+obj4.getPass()+","+obj4.getNickname()+","+obj4.getAddr());
		
		MyConstructor obj5 = new MyConstructor("Ȳ����4","Jaywagger4","12345","4��¥��","����",11);
		System.out.println(obj5.getName()+","+obj5.getId()+","
		+obj4.getPass()+","+obj5.getNickname()+","+obj5.getAddr()+","+obj.getPoint());
	}
}
