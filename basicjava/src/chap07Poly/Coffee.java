package chap07Poly;
//����������: CoffeShop, Beverage, Tea, Coffee
public class Coffee extends Beverage{
	static int amount;
	public Coffee() {
	}
	public Coffee(String name) { //Ŀ�ǰ� ���⼭ �Ǹ�. �ֹ� �� ���� ���
		super(name);
		this.amount++;
	}
	public void calcPrice() {
		/*     <Coffee> 
		   Coffee name �� �̿��Ͽ� price �� �����մϴ�. 
		   - Americano : 1500
		   - CafeLatte : 2500
		   - Cappuccino : 3000 
		*/
		//super(name)�� getName()�� ��� �뵵 ������
		if(getName().equals("Americano")){ 
			setPrice(1500);
		} else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		} else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}  
		
	}
}