package chap07OOP;

public class Dessert {
	private String productName;
	private int price; //�� �������� ������ �����Ͱ� �ԷµǾ� �����Ƿ� int��
	private int count;
	

	public Dessert() {
	}
	public Dessert(String productName, int price, int count) {
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	//Setter&Getter: IceCream overriding�� �ʿ���
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
	
	
	//Setter&Getter ������ �����ϱ� ���ؼ��ε� but �̷� TotalPrice ��������
	// �Ѵٴ� �Ⱦ�. DessertTest���� �䱸�ϴ� get�� ����� ��
	public int getTotalPrice() {
		int totalprice = count*price; //���� x �ݾ�
		return totalprice;
	}
	
	//����Ʈ �޼ҵ� 
	public static void print() {
		System.out.println("================================");
		System.out.println("�ֹ��׸� \t ���� \t ����");
		System.out.println("================================");
	}
	//��ǰ���� �޼ҵ�
	public void printProductInfo() {
		System.out.println(productName+"\t"+price+"\t"+count);
	}
	
	
	
}
