package FreeExercise.Car;

//��ũ�� 77������ 7�� ����
public class CarTest {
	public static void main(String[] args) {
		Car[] car = new Car[2];
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 75, 35, 0);
		//�⺻ ���� ���
		Car.show();
		for (int i = 0; i < car.length; i++) {
			if (car[i] instanceof L3) {
				System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
						+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
						+ ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
						+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
						+ ((L5) car[i]).getTempGage());
			}
		}
		//25����
		System.out.println();
		System.out.println("25 ����");
		Car.show();
		for (int i = 0; i < car.length; i++) {
			car[i].setOil(25);
			if (car[i] instanceof L3) {
				System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
						+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
						+ ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
						+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
						+ ((L5) car[i]).getTempGage());
			}
		}
		//80����
		System.out.println();
		System.out.println("80 ����");
		Car.show();
		for (int i = 0; i < car.length; i++) {
			if (car[i] instanceof L3) {
				((L3)car[i]).go(80);
				System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
				+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
				+ ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				((L5)car[i]).go(80);
			System.out.println(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank()
				+ "\t\t" + car[i].getOilSize() + "\t\t" + car[i].getDistance() + "\t\t"
				+ ((L5) car[i]).getTempGage());
			}
		}
		

	}

}
