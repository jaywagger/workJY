package FreeExercise.Animal;
//�������̽� animal ����. ������� �̸��Ϸ� �ֽ�
public class Dog extends Animal{
	
	//�⺻������
	public Dog() {
	}//������
	public Dog(int speed) {
		super(speed);
		
	}
	//����Ŭ���� �����ε�
	@Override
	public void run(int hours) {
		setDistance(getDistance()+getSpeed() * hours/2.0);
	}
}
