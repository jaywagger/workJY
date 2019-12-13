package chap07Poly;
//다형성연습: CoffeShop, Beverage, Tea, Coffee
public class Tea extends Beverage {
	static int amount;
	public Tea() {
	}
	public Tea(String name) {//티가 여기서 판매. 주문 및 가격 계산
		super(name);
		this.amount++;
	}
	
	public void calcPrice() {
		/*  <Tea> 
		   Tea name 을 이용하여 price 를 설정합니다. 
		   - lemonTea : 1500
		   - ginsengTea : 2000
		   - redginsengTea : 2500
		*/
		if(getName().equals("lemonTea")){ 
			setPrice(1500);
		} else if(getName().equals("ginsengTea")) {
			setPrice(2000);
		} else if(getName().equals("redginsengTea")) {
			setPrice(2500);
		}  
	}

}
