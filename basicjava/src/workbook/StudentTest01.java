package workbook;
//Student01Constructor를 위한 Test 파일로 변경됌. 

public class StudentTest01 {

	public static void main(String[] args) {
		Student01Constructor n1  = new Student01Constructor("Kim",
													100,90,95,89);
		System.out.println(n1.getName()+" 평균: "+n1.getAve()+" 학점: "
												+n1.getGra()+" 학점");
		
		
		Student01Constructor n2  = new Student01Constructor("Lee",
				60,70,99,98);
		System.out.println(n2.getName()+" 평균: "+n2.getAve()+" 학점: "
			+n2.getGra()+" 학점");
	
		
		Student01Constructor n3  = new Student01Constructor("Park",
				68,86,60,40);
		System.out.println(n3.getName()+" 평균: "+n3.getAve()+" 학점: "
			+n3.getGra()+" 학점");
	

	}
}