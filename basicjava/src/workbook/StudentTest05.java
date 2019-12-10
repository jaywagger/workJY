package workbook;
//Student 메소드 이용
public class StudentTest05 {
	public static void main(String[] args) {
		
		Student n1 = new Student();
		n1.setName("Kim");
		n1.setKor(100); 
		n1.setEng(90); 
		n1.setMath(95); 
		n1.setSci(89); 
		
		System.out.println("name	korean	english	math	science"); 
		System.out.println(n1.getName()+"	"+ n1.getKor()+"	"+n1.getEng()+"	"+n1.getMath()+"	"+n1.getSci());
			
		Student n2 = new Student();
		n2.setName("Lee");
		n2.setKor(60); 
		n2.setEng(70); 
		n2.setMath(99); 
		n2.setSci(98); 
		System.out.println(n2.getName()+"	"+ n2.getKor()+"	"+n2.getEng()+"	"+n2.getMath()+"	"+n2.getSci());
		
		Student n3 = new Student();
		n3.setName("Park");
		n3.setKor(68); 
		n3.setEng(86); 
		n3.setMath(60); 
		n3.setSci(40); 
		System.out.println(n3.getName()+"	"+ n3.getKor()+"	"+n3.getEng()+"	"+n3.getMath()+"	"+n3.getSci());
		System.out.println();
		System.out.println();

		/*System.out.println(n1.getName()+" 평균: "+n1.getAve()+" 학점: "+n1.getGra()+"학점");
		System.out.println(n2.getName()+" 평균: "+n2.getAve()+" 학점: "+n2.getGra()+"학점");
		System.out.println(n3.getName()+" 평균: "+n3.getAve()+" 학점: "+n3.getGra()+"학점");
	*/
		n1.print();
		n2.print();
		n3.print();
		}
}