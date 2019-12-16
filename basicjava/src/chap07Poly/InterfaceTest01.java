package chap07Poly;
/*
	�������̽� ����
	<<�������̽�>>
	=> �߻�޼ҵ� (����� ����)�� �����ϴ� Ư���� Ŭ����
	1. �������̽��� interfaceŰ���带 �̿��ؼ� ����
	2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
		- public abstract�� ��������
		- ����� ������ �ڵ����� �߰��Ѵ�.
	3. �������̽��� �������̽��� ����� �� �ִ�. (extends�̿�)
		- ������ ���� �������̽��� �߻�޼ҵ带 ��ӹ޴´�.
	4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)
		- �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡
		extends�� ���� �����ϰ� implements�� �����ؾ� �Ѵ�. (�������)
	5. �������̽��� ���߻���� �����ϴ�. implements ������ �������̽��� ������ ��
		','�� �����Ͽ� ����.
	6. Ŭ������ �������̽��� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�.
*/
//�������̽� ����Ŭ����
interface InterA{
	public abstract void test(); // �������̽��� ������ �߻� ���. ��������
	void display(int num);
}
//�������̽� ����Ŭ����
interface InterB extends InterA{
	void show();
}
interface InterC {
	
}
class SuperA{
	
}
					//B�� A�� �����
//SubA�� SuperA,InterA,InterB,InterC�� ������ �ȴ�.
class SubA extends SuperA implements InterB, InterC{ 
				//A���� 2��, B���� 1�� �߻�޼��� �� 3�� �������̵� �ؾ� ��.

	@Override
	public void test() {
		
	}

	@Override
	public void display(int num) {
		
	}

	@Override
	public void show() {
		
	}
	
}





public class InterfaceTest01 {

	public static void main(String[] args) {
		SuperA obj1 = new SubA(); // �θ�Ÿ���̴� ����
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();// SubA�� �� Ŭ������ ����Ŭ��
	}

}
