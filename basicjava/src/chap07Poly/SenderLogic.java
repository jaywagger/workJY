package chap07Poly;
//sender 클래스를 사용할 것 이다
public class SenderLogic {
	public void run(Sender obj) { //부모타입의 변수로 매개변수를 선언하면 
								// 그 아래 자식 클래스에 엑세스 가능하다
								//sender클래스의 클래스들을 활용하는 메소드
		System.out.println("실행완료");
		obj.print(); // print();는 자식들 메소드
					// Parent와 연결된거지 그 자식들에게 연결된게 아니다.
					// 데이터 타입이 다르다. 
					//그래서 Sender 파일을 abstract 으로 설정하고
					//print();를 넣어주어 다 연결됌.
	}
}
