package workbook;
//company ���� ��ũ�� 55������ ����2��
public class CompanyTest {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		double num1 = Double.parseDouble(args[0]);//double = String X
		
		Company w = new Company(num1);
		/*System.out.println("�� �⺻�� ��: "+w.getIncome()
							+"����: "+w.getAfterTaxIncom());*/
		
		w.print1("�⺻��", w.getIncome(), w.getAfterTaxIncom());
		w.print1("���ʽ�", w.getBonus(), w.getAfterTaxBonus());
		w.print2("���޾�");
		
		
		
		
	}

}
