package FreeExercise.Animal;
public class AnimalTest {
	//�������̽� animal ����. ������� �̸��Ϸ� �ֽ�
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
			System.out.println((i+1)+"�ð� ��");
			System.out.println("���� �̵��Ÿ� = "+dog.getDistance());
			System.out.println("���� �̵��Ÿ� = "+chicken.getDistance());
			System.out.println("������ ���� �̵��Ÿ� ="+cheatableChicken.getDistance());
			System.out.println();
		}
	}
}












