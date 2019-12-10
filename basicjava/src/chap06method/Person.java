package chap06method;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�
// - �ʱⰪ�� �������� �ʾƵ� �������� null, ������ 0, �Ǽ��� 0.0, boolean�� false�� �ʱ�ȭ�ȴ�
// - ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
//	public
//	default
//	protected
//	private

/*Ŭ������ ������ �� ��������� private���� �����ؼ� �ܺο��� ������ �� �ֵ���
������ �����Ͽ� public �޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.*/
public class Person {
		private String name;//Ŭ������ Ư���� ��Ÿ���� ������ - �������
		private String addr;//��������� Ư���� ��Ȳ�� �ƴϸ� �ʱⰪ�� ���� �ʴ´�
		private int age;//�⺻��, ������, �ڹٿ��� ���� ��� ������Ÿ������ ������� Ÿ�԰���

		//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� ����/�����ϴ� �żҵ��
		//���� ������ �� �ִ� �޼Ұ� �ʿ��ϴ�.
		//�̷� ������ �ϴ� �޼Ҹ��� �����ϴ� ���
		
		//name ������ ���� �����ϴ� �޼ҵ�
		//�޼ҵ��: set�� ������: set + ���������, �� ù��°�� �빮��.
		//			setName
		//set ���ϰ��� �����Ƿ� void��
		
		//�̸��� �����ϴ� ����� �޼ҵ�
		public void setName(String name) { //���ڸ� �ޱ� ������ String
			//java ���忡 ��õ� ���
			//������ ���� �Ǵ� ������ �� set+�빮��
			//set�� �ٲٱ⸸ �ϱ⶧���� return�� ����. void
			//�Ű��������� ���� �Ѱ��ֱ� ������ ��������
			this.name = name;
			//(this)������� = ��������. //name = name; �������� = ��������
		}

		//name ������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
		//�޼ҵ��: get + ���������(ù ���� �빮��)
		// getName
		//���� �Ѱ���� �ϱ� ������ ���ϰ��� �ִ�. ���Ͻ� Ÿ���� ����ϰ� ���ϰ� Ÿ�Ե� ���
		public String getName() { //getter method
			return this.name;
			
		}
		
		//Addr private ���� �޼ҵ�: Set
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
		//Addr private ���� �޼ҵ�: Set
		public String getAddr() {
			return this.addr;
		}
	
		
		//Age private ���� �޼ҵ�: Set
		public void setAge(int age ) {
			this.age = age;
		}
		//Age private ���� �޼�: Get
		public int getAge() {
			return this.age;
		}
		
	

}
