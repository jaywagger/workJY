package workbook;
//Student01Constructor�� ���� Test ���Ϸ� �����. 

public class StudentTest01 {

	public static void main(String[] args) {
		Student01Constructor n1  = new Student01Constructor("Kim",
													100,90,95,89);
		System.out.println(n1.getName()+" ���: "+n1.getAve()+" ����: "
												+n1.getGra()+" ����");
		
		
		Student01Constructor n2  = new Student01Constructor("Lee",
				60,70,99,98);
		System.out.println(n2.getName()+" ���: "+n2.getAve()+" ����: "
			+n2.getGra()+" ����");
	
		
		Student01Constructor n3  = new Student01Constructor("Park",
				68,86,60,40);
		System.out.println(n3.getName()+" ���: "+n3.getAve()+" ����: "
			+n3.getGra()+" ����");
	

	}
}