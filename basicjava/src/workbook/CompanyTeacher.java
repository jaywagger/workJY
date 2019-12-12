package workbook;

public class CompanyTeacher {
	private double salary;
	private double annualIncome;
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	//생성자
	public CompanyTeacher() {
	}
	public CompanyTeacher(double salary) {
		this.salary = salary;
	}
	//연 기본급의 합을 계산
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	//세금 후 연 기본급의 합을 계산
		public double getAfterTaxIncome() {
			//afterTaxAnnualIncome = annualIncome-(annualIncome*0.1);
			//비추. 왜냐면 getIncome이 돌려진 후 annualIncome 이 나오기 때문
			afterTaxAnnualIncome = getIncome()-(getIncome()*0.1);
			return afterTaxAnnualIncome;
		}
		public double getGetbonus() {
			bonus =(salary*0.2)*4;
			return bonus;
		}
		public double getafterTaxBonus() {
			afterTaxBonus = getGetbonus()-getGetbonus()*0.055;
			return afterTaxBonus;
		}
	
	
}
