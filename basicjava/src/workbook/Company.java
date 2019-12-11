package workbook;
//워크북 55페이지 문제2번
public class Company {
	double salary;
	
	//기본 생성자
	public Company() {
	}
	//salary 생성자
	public Company(double salary) {
		this.salary = salary;
	}
	//연 기본급의 합 메소드
	public double getIncome() {
		double sum = salary*12;
		return sum;
	}
	
	//세금후 연봉 메소드
	public double getAfterTaxIncom() {
		double sumSalaryAfterTax = getIncome()-(getIncome()*0.1);
		return sumSalaryAfterTax;
	}
	
	//세금 전 보너스 메소드
	public double getBonus() {
		double bonus = 4*(0.2*salary);
		return bonus;
	}
	
	//세금 후 보너스 메소드
	public double getAfterTaxBonus() {
		double afterTaxBonus = getBonus()-(0.055*getBonus());
		return afterTaxBonus;
	}
	
	//프린트 메소드
	public void print1(String z, double x, double y) {
		String print1 = "연 "+z+" 합: "+x+" 세후: "+y;
		System.out.println(print1);
	}
	public void print2(String a) {
		String print2 = "연 "+a+" 합: "+(getAfterTaxBonus()+getAfterTaxIncom());
		System.out.println(print2);
	}
	
}
