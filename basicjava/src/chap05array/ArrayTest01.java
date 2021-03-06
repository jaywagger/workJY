package chap05array;
//배열의 문법 연급 - 사용하는 방법
// 만개의 데이터때문에 변수 만개를 만드는게 아니고 Array를 활용하여 1개 변수에 여러 데이터를 넣는다. 
public class ArrayTest01 {
	public static void main(String[] args) 
	{
		//1. 배열의 선언
		int[] myarry;
		int[] myarry2;
		
		//2. 베열의 생성
		myarry = new int[5];
		System.out.println(myarry); //heap에 할당된 주소값 확인
		
		myarry2 = new int[5];
		System.out.println(myarry2); //서로 다른 주소가 나온다.
		System.out.println("----------------------");
		
		//다섯개의 공간에 접근하는 방법
		System.out.println("myarry의 2번 요소의 값="+myarry[2]); //초기값 0
		
		//3. 배열의 초기화. 2번 요소에 100 저장해보기
		myarry[2] = 100;
		System.out.println("myarry의 2번 요소의 값은=>"+myarry[2]);
		
		//배열의 선언과 생성을 한번에 처리
		int []newarry = new int[3];
		boolean[] booleanArr = new boolean[5];
		long[] longArr = new long[100];
		double[] doublearr = new double[100];
		
		//배열의 기본 초기값
		//기본형인 경우
				//정수형: 0 
				//boolean: false
				//실수형: 0.0
		System.out.println(newarry[0]);
		System.out.println(booleanArr[0]);
		System.out.println(longArr);
		System.out.println(doublearr);

		
		
		

	}
}
