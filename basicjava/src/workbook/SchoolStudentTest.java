package workbook;

public class SchoolStudentTest {

	public static void main(String[] args) {
		
		SchoolStudent studentArray [] = new SchoolStudent[3]; //배열 생성
		studentArray [0] = new SchoolStudent("홍길동", //인스턴스 생성
										15, 171, 81);
		studentArray [1] = new SchoolStudent("한사람", //인스턴스 생성
										13, 183, 72);
		studentArray [2] = new SchoolStudent("임걱정", //인스턴스 생성
										16, 175, 65);
		
		System.out.println("이름"+"\t"+"나이"+"\t"+"신장"+"\t"+"몸무게");
		// sum 배열
		//int sum = 0 하나씩
		int sum[] = new int[3]; //배열로 묶어서
		double ave[] = new double[3];
		for(int i=0; i<studentArray.length;i++) { //배열 초기화
			studentArray[i].show();
			// sum = sum+studentArray [i].getAge();
			sum[0] = sum[0] + studentArray [i].getAge();
			sum[1] = sum[1] + studentArray [i].getHeight();
			sum[2] = sum[2] + studentArray [i].getWeight();
			
		}
		System.out.println(ave [0] = sum[0]/studentArray.length);
		/*System.out.println("신장의 평균: "+ave [1] = sum[1]/studentArray.length);
		System.out.println("몸무게의 평균: "+ave [2] = sum[2]/studentArray.length);
		*/
		//이걸 활용하면 배열의 데이터를 추출할 수 있다
		//System.out.println(studentArray [0].getAge());		
		
		
;
	}
}
