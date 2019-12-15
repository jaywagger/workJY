package chap05array;

public class ArrayExcercise {

	public static void main(String[] args) {
		int [] myarry = new int [5]; //참조형 변수 선언 = 배열문 생성
		
		//배열문 초기화 작업
		myarry[0] = 50;
		myarry[1] = 60;
		myarry[2] = 70;
		myarry[3] = 80;
		myarry[4] = 90;
		for(int i=0; i < myarry.length; i++) {
			System.out.printf("%d.myarry: %d%n", i, myarry[i]);
		
		}

	}
}
