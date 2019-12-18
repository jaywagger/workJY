package workbook.P75;

//��ũ�� 77������ 7������
public class CarTest {
	public static void main(String[] args) {
		Car[] car = new Car[2]; // Car ������ Ÿ���� car �迭 ���� �� ����
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
		Car.show();
		
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t"
					+ car[i].getOilSize() + "\t" + car[i].getDistance());
			if (car[i] instanceof L3) {
				System.out.println("\t\t" + ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				System.out.println("\t\t" + ((L5) car[i]).getTempGage());
			}
		}
		System.out.println();
		System.out.println("25 ����");
		Car.show();

		for (int i = 0; i < car.length; i++) {
			if (car[i] instanceof L3) {
				((L3) car[i]).setOil(25);
				System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t"
						+ car[i].getOilSize() + "\t" + car[i].getDistance());
				System.out.println("\t\t" + ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				((L5) car[i]).setOil(25);
				System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t"
						+ car[i].getOilSize() + "\t" + car[i].getDistance());
				System.out.println("\t\t" + ((L5) car[i]).getTempGage());
			}
		}
		System.out.println();
		System.out.println("80 ����");
		Car.show();
		for (int i = 0; i < car.length; i++) {
			if (car[i] instanceof L3) {
				((L3) car[i]).go(80);
				System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t"
						+ car[i].getOilSize() + "\t" + car[i].getDistance());
				System.out.println("\t\t" + ((L3) car[i]).getTempGage());
			} else if (car[i] instanceof L5) {
				((L5) car[i]).go(80);
				System.out.print(car[i].getName() + "\t\t" + car[i].getEngine() + "\t\t" + car[i].getOilTank() + "\t"
						+ car[i].getOilSize() + "\t" + car[i].getDistance());
				System.out.println("\t\t" + ((L5) car[i]).getTempGage());
			}
		}
	}

}
