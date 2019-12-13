package chap07Poly;
//다형성연습: CoffeShop, Beverage, Tea, Coffee
public class Coffee extends Beverage{
	static int amount;
	public Coffee() {
	}
	public Coffee(String name) { //커피가 여기서 판매. 주문 및 가격 계산
		super(name);
		this.amount++;
	}
	public void calcPrice() {
		/*     <Coffee> 
		   Coffee name 을 이용하여 price 를 설정합니다. 
		   - Americano : 1500
		   - CafeLatte : 2500
		   - Cappuccino : 3000 
		*/
		//super(name)과 getName()의 사용 용도 차이점
		if(getName().equals("Americano")){ 
			setPrice(1500);
		} else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		} else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}  
		
	}
}