package chap07OOP;

public class IceCream extends Dessert{
	private int calorie;

	public IceCream() {
	}
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName,price,count);
		this.calorie = calorie;
	}
	
	//����Ʈ �޼ҵ� ������: �������̵�
		public static void print() {
			System.out.println("================================");
			System.out.println("�ֹ��׸� \t ���� \t ���� \t Į�θ�");
			System.out.println("================================");
		}
	//��ǰ���� �޼ҵ� ������: �������̵�
		public void printProductInfo() {
			System.out.println(getProductName()+"\t"+getPrice()
					+"\t"+getCount()+"\t"+calorie+"kcal");
		}
		
}
