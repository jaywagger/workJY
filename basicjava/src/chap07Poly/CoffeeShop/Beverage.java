package chap07Poly.CoffeeShop;
//����������: CoffeShop, Beverage, Tea, Coffee
public abstract class Beverage {
	private String name; //-�� private
	protected int price; //#�� protected
	//�⺻������
	public Beverage() {
	}
	public Beverage(String name) { //���⼭ �̸��� ����. price�� �ȉ�
		this.name = name;
	}
	//calPrice()�� �߻�ȭ�Ѵ�
	public abstract void calcPrice();
	//print�޼���
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
