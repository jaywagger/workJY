package chap07Poly.CoffeeShop;
//����������: CoffeShop, Beverage, Tea, Coffee
public class Coffee extends Beverage{
	static int amount;
	static int totalprice;
	public Coffee() {
	}
	public Coffee(String name) { //Ŀ�ǰ� ���⼭ �Ǹ�. �ֹ� �� ���� ���
		super(name);
		//this.amount = this.amount+1;
		this.amount++;
	}
	@Override
	public void calcPrice() {
		 /*  - Americano : 1500

		   - CafeLatte : 2500

		   - Cappuccino : 3000 */
		if(getName().equals("Americano")) {
			setPrice(1500);
		}else if (getName().equals("CafeLatte")){
			setPrice(2500);
		}else if (getName().equals("Cappuccino")){
			setPrice(3000);
		}
		
	}

}