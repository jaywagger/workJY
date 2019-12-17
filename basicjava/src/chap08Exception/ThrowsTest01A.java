package chap08Exception;
//ThrowsTest01 이어지는 클래스
public class ThrowsTest01A {
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		int num = obj.test(100,0);
		System.out.println("결과: " + num);
		//호출쪽에서 변경 불가
	}

}
