package workbook;

public class CompanyTeacher {
	private double salary;
	private double annualIncome;
	private double afterTaxAnnualIncome;
	private double bonus;
	private double afterTaxBonus;
	
	//������
	public CompanyTeacher() {
	}
	public CompanyTeacher(double salary) {
		this.salary = salary;
	}
	//�� �⺻���� ���� ���
	public double getIncome() {
		annualIncome = salary*12;
		return annualIncome;
	}
	//���� �� �� �⺻���� ���� ���
		public double getAfterTaxIncome() {
			//afterTaxAnnualIncome = annualIncome-(annualIncome*0.1);
			//����. �ֳĸ� getIncome�� ������ �� annualIncome �� ������ ����
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
