package workbook;
//Student01���� setter ��� Ȱ��� ������ �޼ҵ� �����
public class Student01Constructor {
	
	private String name;
	private int math;
	private int sci;
	private int kor;
	private int eng;
	
	//������ ���
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
	
	//Average �޼ҵ�
	public double getAve() {
		double ave = (double)(this.kor+this.eng+this.math+this.sci)/4;
		return ave;
	}
	
	//Grade �޼ҵ�
			public String getGra() {
				double ave = getAve();
				String gra = ""; //String �ʱ�ȭ
				
				if(ave >100 | ave<0){
					System.out.println("�߸��Է�");
				}
				else {
					if(ave >= 90 ){
						//System.out.print("A"); 
						//�Լ��� ����� �� ���ڰ� �ٷ� ��� by ����������
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
	
	//����Ʈ �޼ҵ�	
			public void print() {
				System.out.println(getName()+" ���: "+getAve()+" ����: "+getGra()+"����");
			}

}
