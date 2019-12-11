package chap06OOPConstructor;
//메소드의 매개변수로 기본형과 참조형을 정의하는 경우 차이점
//책 p264~8
public class CallByTest {
	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		int i = 100;
		int [] myarry = new int[5];
		for(int j=0; j<myarry.length;j++) { //100씩 배열에 초기화됌
			myarry[j] = 100;
		}
		System.out.println("==========change 호출 전============");
		obj.display(i, myarry);
		obj.change(i, myarry);
		System.out.println("==========change 호출 후============");
		obj.display(i,myarry);
		
	}
	
	public void display(int num, int[]myarry) {
		System.out.println("i = "+num);
		System.out.println("myarry의 요소 값");
		for(int i=0; i<myarry.length;i++) {
			System.out.print(myarry[i]+"\t");
		}
		System.out.println();
	}
	//매개변수로 전달된  i와 myarry가 참조하는 배열의 요소 값을 변경하는 메소드
	public void change(int i, int []myarry) {
		i = 200;//i(100)를 200으로 바꿈 
		myarry[1] = 200; // 1번요소 배열을 200으로 바꿈
	}

}
