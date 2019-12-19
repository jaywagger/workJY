package FreeExercise.Animal;
//인터페이스 animal 예제. 강사님이 이메일로 주심
public class Chicken extends Animal implements Cheatable{
	//기본생성자
	public Chicken() {
	}//생성자
	public Chicken(int speed) {
		super(speed);
	}
	//상위클래스 오버로딩
	@Override
	public void fly() {
		setSpeed(getSpeed()*2);
	}
	//인터페이스 오버로딩
	@Override
	public void run(int hours) {
		setDistance(getDistance()+(double)(getSpeed() * hours));
	}
}
