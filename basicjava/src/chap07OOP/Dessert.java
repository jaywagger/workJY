package chap07OOP;

public class Dessert {
	private String productName;
	private int price; //딱 떨어지는 정수형 데이터가 입력되어 있으므로 int다
	private int count;
	

	public Dessert() {
	}
	public Dessert(String productName, int price, int count) {
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	//Setter&Getter: IceCream overriding에 필요함
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	//Setter&Getter 변수에 접근하기 위해서인데 but 이런 TotalPrice 변수없음
	// 둘다는 안씀. DessertTest에서 요구하는 get만 만들면 됌
	public int getTotalPrice() {
		int totalprice = count*price; //수량 x 금액
		return totalprice;
	}
	
	//프린트 메소드 
	public static void print() {
		System.out.println("================================");
		System.out.println("주문항목 \t 가격 \t 수량");
		System.out.println("================================");
	}
	//상품정보 메소드
	public void printProductInfo() {
		System.out.println(productName+"\t"+price+"\t"+count);
	}
	
	
	
}
