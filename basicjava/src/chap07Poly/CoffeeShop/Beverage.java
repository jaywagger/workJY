package chap07Poly.CoffeeShop;
//다형성연습: CoffeShop, Beverage, Tea, Coffee
public abstract class Beverage {
	private String name; //-는 private
	protected int price; //#은 protected
	//기본생성자
	public Beverage() {
	}
	public Beverage(String name) { //여기서 이름만 셋팅. price는 안됌
		this.name = name;
	}
	//calPrice()를 추상화한다
	public abstract void calcPrice();
	//print메서드
	public void print() {
		
		System.out.println("");
	}
	
	//Setter&Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
