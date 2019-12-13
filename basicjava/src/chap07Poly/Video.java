package chap07Poly;
//다형성 예제: Videoshop, content, video
public class Video extends Content{
	String genre;
	
	//생성자: 생성자    title 과 genre 를 매개변수로 받는 생성자
	//추상클래스를 상속받아왔고, 그 안에 abstract 메소드가 있으므로
	//에러가 떴고, 해결하기 위해 오버라이딩한다.
	public Video() {
		
	}
	public Video(String Title, String genre){
		//Content의 기본생성자를 만들지 않으면 오류가 뜬다.
		super(Title);
		this.genre = genre;
	}
	//오버라이딩이 필요한 메소드.
	/*- totalPrice()구현  genre 의 값에 따라 다음과 같이 price 변수에 가격을 셋팅하세요.  
    “new”인 경우 : 2000  
    “comic”인 경우 : 1500 
    “child”인 경우 : 1000*/

	public void totalPrice(){
		if(genre.equals("new")){ 
			setPrice(2000);
		} else if(genre.equals("comic")) {
			setPrice(1500);
		} else if(genre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
		}
	} 
	
	//Setter&Getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
