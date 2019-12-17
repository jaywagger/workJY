package chap08Exception;
//ThrowsTest01 이어지는 클래스
public class ThrowsTest02A {
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		int num = obj.test(100,0);
		System.out.println("결과: " + num);
		
		ThrowsTest02 obj2 = new ThrowsTest02();
		
		int inputNum = 100;
		int num2=0;
		try {
			num2 = obj2.test(inputNum, 0);
		}catch(ArithmeticException e) {
			if(inputNum%2==0) {
				System.out.println("222");
			}else if (inputNum%3==0) {
				System.out.println("333");
			}else {
				System.out.println("000");
			}
			
		}
	
	
	
	}

}
