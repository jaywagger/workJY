package workbook;
//Workbook 24page Problem No.5
public class Calc {
	
	public int calcSum (int a, int b, int c, int d) {
		int sum = a+b+c+d;
		return sum;
	} 
	
	public double calcAve (int sum) {
		double ave = 0.0;
		ave = (double)sum/4;
		return ave;
	} 
/*
	public static void main(String[] args) {
		/*
		 * args = new String[2]
		 * 					------
		 * 						����� �Ű������� ������ŭ ����
		 * args[0] = "100"
		 * args[1] = "200"
		 
		System.out.println("ù ��° �����Ű�����->"+args[0]);
		System.out.println("�� ��° �����Ű�����->"+args[1]);
		System.out.println("�� ��° �����Ű�����->"+args[2]);
		System.out.println("�� ��° �����Ű�����->"+args[3]);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//String���� �Է¹��� �����Ű������� int�� ��ȯ
		int num1 = Integer.parseInt(args[0]);//int = String X
		int num2 = Integer.parseInt(args[1]);//int = String X
		int num3 = Integer.parseInt(args[2]);//int = String X
		int num4 = Integer.parseInt(args[3]);//int = String X

		System.out.println("��=>"+(num1+num2+num3+num4));
	
	}*/
}
