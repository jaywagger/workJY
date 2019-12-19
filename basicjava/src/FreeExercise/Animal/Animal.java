package FreeExercise.Animal;
//�������̽� animal ����. ������� �̸��Ϸ� �ֽ�
public abstract class Animal {
	private int speed;
	private double distance;
	//�⺻������
	public Animal() {
	}
	//������
	public Animal(int speed) {
		super();
		this.speed = speed;
	}
	//Run �߻� �ż���
	public abstract void run(int hours);
	
	//Distance�ż���
	public double getDistance () {
		return distance;
	}
	//Setter&Getter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
