package FreeExercise.Animal;
//�������̽� animal ����. ������� �̸��Ϸ� �ֽ�
public class Chicken extends Animal implements Cheatable{
	//�⺻������
	public Chicken() {
	}//������
	public Chicken(int speed) {
		super(speed);
	}
	//����Ŭ���� �����ε�
	@Override
	public void fly() {
		setSpeed(getSpeed()*2);
	}
	//�������̽� �����ε�
	@Override
	public void run(int hours) {
		setDistance(getDistance()+(double)(getSpeed() * hours));
	}
}
