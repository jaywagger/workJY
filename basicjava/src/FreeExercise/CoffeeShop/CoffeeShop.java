package FreeExercise.CoffeeShop;

import FreeExercise.CoffeeShop.Beverage;
import FreeExercise.CoffeeShop.Coffee;
import FreeExercise.CoffeeShop.Tea;

public class CoffeeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		Beverage[] beverage = new Beverage[5];
		beverage[0] = new Coffee("Cappuccino");
		beverage[1] = new Coffee("CafeLatte");
		beverage[2] = new Tea("ginsengTea");
		beverage[3] = new Coffee("CafeLatte");
		beverage[4] = new Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>" + getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>" + Coffee.amount + "��");
		System.out.println("Tea�� �Ǹ� ����=>" + Tea.amount + "��");
	}

	// ����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 ���⿡ �ۼ��ϼ���
	public static void getSalesInfo(Beverage[] beverage) {
		for (int i = 0; i < beverage.length; i++) {
			beverage[i].calcPrice();
			System.out
					.println(i + 1 + " ��° �Ǹ� ����� " + beverage[i].getName() + " �̸�," + " ������ " + beverage[i].getPrice());
		}
	}

	// ����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
	public static int getTotalPrice(Beverage[] beverage) {
		int totalPrice=0;
		for (int j = 0; j < beverage.length; j++) {
			totalPrice += beverage[j].getPrice();
		}
		return totalPrice;
	}
}
