package workbook;

public class CalcTest05 {
	public static void main(String[] args) {
		//String���� �Է¹��� �����Ű������� int�� ��ȯ
		int a = Integer.parseInt(args[0]);//int = String X
		int b = Integer.parseInt(args[1]);//int = String X
		int c = Integer.parseInt(args[2]);//int = String X
		int d = Integer.parseInt(args[3]);//int = String X
		
		Calc student = new Calc(); //Calc �޼��� Ȱ��
		int sum = student.calcSum(a, b, c, d);
		double ave = student.calcAve(sum);
		
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+ave);
		
		if(ave>100 & ave < 0)
		{
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
		else 
		{
			if (ave >= 90)
			{
				System.out.println("A����");
			}
			else if (ave >= 70)
			{
				System.out.println("B����");
			}
			else if (ave >= 50)
			{
				System.out.println("C����");
			}
			else if (ave >= 30)
			{
				System.out.println("D����");
			}
			else
			{
				System.out.println("F����");
		}
		
		}
		
		
		
/*		System.out.println("ù ��° �����Ű�����->"+args[0]);
		System.out.println("�� ��° �����Ű�����->"+args[1]);
		System.out.println("�� ��° �����Ű�����->"+args[2]);
		System.out.println("�� ��° �����Ű�����->"+args[3]);
	
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}*/


	
	}
}
