package chap05.array;
//2차원배열 작성 연습
public class Array2DTest01 {

	public static void main(String[] args) 
	{	//2차원 배열의 선언과 생성
		int[][] myarry = new int[2][3];
		//3개의 요소를 갖고있는 배열을 참조하는 배열의 요소가 2개
		
		//2차원배열의 초기화
		myarry[0][0] = 100;
		myarry[1][1] = 200;
		
		
		System.out.println("myarry의 2번째 요소가 참조하는 배열의 0번요소의 값: "
				+ ""+myarry[1][0]);
		System.out.println("myarry의 1번째 요소가 참조하는 배열의 0번요소의 값: "
				+myarry[0][0]);
		
		//다차원 배열의 요소의 갯수
		System.out.println("배열의 갯수=> "+myarry.length); 
		//참조배열은 앞에꺼 2개뿐
		System.out.println("myarry의 0번 요소가 참조하는 배열의 요소 갯수: "
		+myarry[0].length);
		System.out.println("myarry의 1번 요소가 참조하는 배열의 요소 갯수: "
		+myarry[1].length);
		
		//전체 배열의 요소를 엑세스하기 - length를 직접 쓰고 접근하기
		for(int outer=0; outer<2; outer++) 
		{//for(int outer=0; outer<myarry.length; outer++)
			for(int i=0; i<3; i++)
				//for(int i=0; i<myarry[outer].length; i++)
			{
				System.out.print(myarry[outer][i]+"\t");
			} System.out.println();
		}
		System.out.println("----------같은 값 다른 방식-----------");
		//전체 배열의 요소를 엑세스하기 - length 변수를 이용해서 접근하기
		for(int outer=0; outer<myarry.length; outer++)
		{
			for(int i=0; i<myarry[outer].length; i++)
				//myarry[outer].length =3
				//myarry[0].length = 3
				//셀에 지정된 데이터 크기는 그 범위내에서 모두 같다.
			{
				System.out.print(myarry[outer][i]+"\t");
			} System.out.println();
		}
	
	
	}

}
