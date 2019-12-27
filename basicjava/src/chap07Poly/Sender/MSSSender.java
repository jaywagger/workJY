package chap07Poly.Sender;
//나중에 추가됬지만 다른 파일을 수정할 필요가 없음.
//다 연동됌. 그 이유는
// 상위폴더를 상속받았기 때문. 
public class MSSSender extends Sender {
	int length;
	public MSSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void print() {
		//SMS Sender의 고유 기능을 실행
		System.out.println(length+"로"+name+"전송완료");
	}
	
}
