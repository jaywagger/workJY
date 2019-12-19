package FreeExercise.Animal;
//인터페이스 animal 예제. 강사님이 이메일로 주심
public abstract class Animal {
	private int speed;
	private double distance;
	//기본생성자
	public Animal() {
	}
	//생성자
	public Animal(int speed) {
		super();
		this.speed = speed;
	}
	//Run 추상 매서드
	public abstract void run(int hours);
	
	//Distance매서드
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
