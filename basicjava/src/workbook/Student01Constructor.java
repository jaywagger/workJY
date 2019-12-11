package workbook;
//Student01에서 setter 대신 활용될 생성자 메소드 만들기
public class Student01Constructor {
	
	private String name;
	private int math;
	private int sci;
	private int kor;
	private int eng;
	
	//생성자 사용
	public Student01Constructor (String name, int math, int sci, int kor, int eng) {
		this.name = name;
		this.math = math; 
		this.sci = sci;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//Average 메소드
	public double getAve() {
		double ave = (double)(this.kor+this.eng+this.math+this.sci)/4;
		return ave;
	}
	
	//Grade 메소드
			public String getGra() {
				double ave = getAve();
				String gra = ""; //String 초기화
				
				if(ave >100 | ave<0){
					System.out.println("잘못입력");
				}
				else {
					if(ave >= 90 ){
						//System.out.print("A"); 
						//함수가 실행될 때 글자가 바로 출력됌 by 누리선생님
						gra="A";
					}
					else if (ave>=70){
						gra="B";
					}
					else if (ave>=50){
						gra="C";
					}
					else if (ave>=30){
						gra="D";
					}
					else {
						gra="F";
					}
					
				}
				return gra;
			}
	
	//프린트 메소드	
			public void print() {
				System.out.println(getName()+" 평균: "+getAve()+" 학점: "+getGra()+"학점");
			}

}
