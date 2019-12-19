package FreeExercise.Animal;
//인터페이스 animal 예제. 강사님이 이메일로 주심
public class Dog extends Animal{
	
	//기본생성자
	public Dog() {
	}//생성자
	public Dog(int speed) {
		super(speed);
		
	}
	//상위클래스 오버로딩
	@Override
	public void run(int hours) {
		setDistance(getDistance()+getSpeed() * hours/2.0);
	}
}
