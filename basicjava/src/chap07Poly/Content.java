package chap07Poly;
//다형성 예제: Videoshop, content, video
public abstract class Content {
	String title;
	int price;
	//생성자: 생성자   기본생성자    title 을 매개변수로 받는 생성자 
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
	
	//추상메서드: 추상클래스가 요구된다
	public abstract void totalPrice();  //이걸 다 공통으로 사용하겠다는 의도
										//abstract는 body가 없음
	//show method
	public void show() {
		System.out.println(title+"비디오의 가격은 "+price+"입니다.");
	}
	



}



