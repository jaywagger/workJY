package chap07OOP;

public class IceCream extends Dessert{
	private int calorie;

	public IceCream() {
	}
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName,price,count);
		this.calorie = calorie;
	}
	
	//프린트 메소드 재정의: 오버라이딩
		public static void print() {
			System.out.println("================================");
			System.out.println("주문항목 \t 가격 \t 수량 \t 칼로리");
			System.out.println("================================");
		}
	//상품정보 메소드 재정의: 오버라이딩
		public void printProductInfo() {
			System.out.println(getProductName()+"\t"+getPrice()
					+"\t"+getCount()+"\t"+calorie+"kcal");
		}
		
}
