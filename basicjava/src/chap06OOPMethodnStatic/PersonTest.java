package chap06OOPMethodnStatic;
//PersonŬ������ ����ϴ� Ŭ����
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("Ȳ����","Suwon",26);
		/*p1.setName("Ȳ����"); //set�޼ҵ�� ��
		p1.setAge(26); //set�޼ҵ�� ��
		p1.setAddr("Suwon"); //set�޼ҵ�� ��
*/		System.out.println("����:"+p1.getName()); //set �޼ҵ忡�� get�� ���� ������ ��
		System.out.println("�ּ�:"+p1.getAddr());
		System.out.println("����:"+p1.getAge());
		
		System.out.println("+++++++++++++++++++++++++");
		Person p2 = new Person("Ȳ���� ����","Seoul",27);
		/*p2.setName("Ȳ���� ����"); //set�޼ҵ�� ��
		p2.setAge(27); //set�޼ҵ�� ��
		p2.setAddr("Seoul"); //set�޼ҵ�� ��
*/		
		p1.setName("Ȳ����"); //set�޼ҵ�� ��
		System.out.println("����:"+p2.getName());
		System.out.println("�ּ�:"+p2.getAddr());
		System.out.println("����:"+p2.getAge());
	}
}