package chap07OOP;
//��� ��������
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Kim",25,100,90,98,89);
		Student s2 = new Student("Lee",25,60,70,99,98);
		Student s3 = new Student("Park",25,68,86,60,40);
		Teacher t1 = new Teacher("Ȳ����",45,"Spring");
		Staff e = new Staff("ȲȲȲ",26,"�����");
	
		s1.print();
		s2.print();
		s3.print();
		t1.print();
		e.print();
		
		
		
	}

}
