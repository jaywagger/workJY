package chap08Exception;
//try~~~catch로 예외를 처리
public class ExceptionTest02{
	public static void main(String[] args) {
		try {
			System.out.println("******프로그램시작*****");
			System.out.println(10/0);//예외가 발생할 수 있는 문장
			System.out.println("******프로그램종료*****");
		}catch(ArithmeticException e){
			//catch(Exception e){ 무슨 오류인지 모를 경우 사용
			System.out.println("오류발생....");
			System.out.println("예외메시지:"+e.getMessage());
			e.printStackTrace();//void

		}
	}
}
