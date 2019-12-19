package FreeExercise.Animal;
public class AnimalTest {
	//인터페이스 animal 예제. 강사님이 이메일로 주심
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		for (int i =0; i < 3; i++){
			((Dog)(dog)).run(1);
			((Chicken)(cheatableChicken)).run(1);
			((Chicken)(chicken)).run(1);
			System.out.println((i+1)+"시간 후");
			System.out.println("개의 이동거리 = "+dog.getDistance());
			System.out.println("닭의 이동거리 = "+chicken.getDistance());
			System.out.println("날으는 닮의 이동거리 ="+cheatableChicken.getDistance());
			System.out.println();
		}
	}
}












