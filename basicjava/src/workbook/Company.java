package workbook;
//��ũ�� 55������ ����2��
public class Company {
	double salary;
	
	//�⺻ ������
	public Company() {
	}
	//salary ������
	public Company(double salary) {
		this.salary = salary;
	}
	//�� �⺻���� �� �޼ҵ�
	public double getIncome() {
		double sum = salary*12;
		return sum;
	}
	
	//������ ���� �޼ҵ�
	public double getAfterTaxIncom() {
		double sumSalaryAfterTax = getIncome()-(getIncome()*0.1);
		return sumSalaryAfterTax;
	}
	
	//���� �� ���ʽ� �޼ҵ�
	public double getBonus() {
		double bonus = 4*(0.2*salary);
		return bonus;
	}
	
	//���� �� ���ʽ� �޼ҵ�
	public double getAfterTaxBonus() {
		double afterTaxBonus = getBonus()-(0.055*getBonus());
		return afterTaxBonus;
	}
	
	//����Ʈ �޼ҵ�
	public void print1(String z, double x, double y) {
		String print1 = "�� "+z+" ��: "+x+" ����: "+y;
		System.out.println(print1);
	}
	public void print2(String a) {
		String print2 = "�� "+a+" ��: "+(getAfterTaxBonus()+getAfterTaxIncom());
		System.out.println(print2);
	}
	
}
