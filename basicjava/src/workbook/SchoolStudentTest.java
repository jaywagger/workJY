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
		for(int i=0; i<studentArray.length;i++) { //배열 초기화
			studentArray[i].show();
		}
		
		
		
		System.out.println("나이의 평균: "+ageAve);
		System.out.println("신장의 평균: "+heightAve);
		System.out.println("몸무게의 평균: "+WeightAve);
	}
}
