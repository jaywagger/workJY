package chap07Poly;
//������ ����: Videoshop, content, video
public abstract class Content {
	String title;
	int price;
	//������: ������   �⺻������    title �� �Ű������� �޴� ������ 
	public Content() {
	}
	public Content(String title) {
		this.title = title;
	}
	
	//Setter & Getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//�߻�޼���: �߻�Ŭ������ �䱸�ȴ�
	public abstract void totalPrice();  //�̰� �� �������� ����ϰڴٴ� �ǵ�
										//abstract�� body�� ����
	//show method
	public void show() {
		System.out.println(title+"������ ������ "+price+"�Դϴ�.");
	}
	



}



