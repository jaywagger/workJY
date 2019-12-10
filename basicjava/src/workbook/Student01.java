package workbook;

public class Student01 {

		private String name;
		private int math;
		private int sci;
		private int kor;
		private int eng;
		
		//Name
		public void setName(String name) { 
			this.name = name;	
		}
		public String getName() { 
			return this.name;	
		}
		
		//Math
		public void setMath(int math ) {
			this.math = math;	
		}
		public int getMath() {
			return this.math;	
		}
		
		//Science
		public void setSci(int sci ) {
			this.sci = sci;	}
		public int getSci() {
			return this.sci;	
		}
		
		//Korean
		public void setKor(int kor ) {
			this.kor = kor;	
		}
		public int getKor() {
			return this.kor;	
		}
		
		//English
		public void setEng(int eng ) {
			this.eng = eng;
		}
		public int getEng() {
			return this.eng;	
		}
		
				
		//Average
		public double getAve() {
			double ave = (double)(this.kor+this.eng+this.math+this.sci)/4;
			return ave;
		}
		
		//Grade
		public String getGra() {
			double ave = getAve();
			String gra="";
			
			if(ave > 100 & ave < 0)
			{
				gra = "잘못 입력하셨습니다";
			}
			else 
			{
				if (ave >= 90)
				{
					gra = "A";
				}
				else if (ave >= 70)
				{
					gra = "B";
				}
				else if (ave >= 50 )
				{
					gra = "C";
				}
				else if (ave >= 30 )
				{
					gra = "D";
				}
				else {
					gra = "F";
				}
				
			}
			return gra;
		}
		
		
		
	}
	

