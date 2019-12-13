package chap07Poly;
//����������: CoffeShop, Beverage, Tea, Coffee
public class Tea extends Beverage {
	static int amount;
	public Tea() {
	}
	public Tea(String name) {//Ƽ�� ���⼭ �Ǹ�. �ֹ� �� ���� ���
		super(name);
		this.amount++;
	}
	
	public void calcPrice() {
		/*  <Tea> 
		   Tea name �� �̿��Ͽ� price �� �����մϴ�. 
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
