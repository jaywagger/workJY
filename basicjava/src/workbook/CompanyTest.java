package workbook;
//company 파일 워크북 55페이지 문제2번
public class CompanyTest {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		double num1 = Double.parseDouble(args[0]);//double = String X
		
		Company w = new Company(num1);
		/*System.out.println("연 기본급 합: "+w.getIncome()
							+"세후: "+w.getAfterTaxIncom());*/
		
		w.print1("기본급", w.getIncome(), w.getAfterTaxIncom());
		w.print1("보너스", w.getBonus(), w.getAfterTaxBonus());
		w.print2("지급액");
		
		
		
		
	}

}
