package FreeExercise.CoffeeShop;

public class Coffee extends Beverage {
	static int amount;
	public Coffee() {
	}public Coffee(String name) {
		super(name);
		amount++;
	}

	@Override
	public void calcPrice() {
		if(getName().equals("Cappuccino")) {
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(3000);
		}
		
		
	}
	
}
