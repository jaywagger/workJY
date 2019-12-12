package workbook;

public class CompanyTeacherTest {

	public static void main(String[] args) {
		//company의 salary가 double이고 입력받은 salary가 int이므로 
		//자동 casting이 됩니다.
		int salary = Integer.parseInt(args[0]);
		Company company = new Company(salary);
		System.out.println("연 기본급 합: "+company.getIncome()
						+" 세후: "+company.getAfterTaxIncom()
						+"\n연 보너스 합: "+company.getBonus()
						+" 세후: "+company.getAfterTaxBonus()
						+"\n연 지급액 합: "+(company.getAfterTaxIncom()+company.getAfterTaxBonus()));

	}

}
