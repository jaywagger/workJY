package workbook;

public class CompanyTeacherTest {

	public static void main(String[] args) {
		//company�� salary�� double�̰� �Է¹��� salary�� int�̹Ƿ� 
		//�ڵ� casting�� �˴ϴ�.
		int salary = Integer.parseInt(args[0]);
		Company company = new Company(salary);
		System.out.println("�� �⺻�� ��: "+company.getIncome()
						+" ����: "+company.getAfterTaxIncom()
						+"\n�� ���ʽ� ��: "+company.getBonus()
						+" ����: "+company.getAfterTaxBonus()
						+"\n�� ���޾� ��: "+(company.getAfterTaxIncom()+company.getAfterTaxBonus()));

	}

}
