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
		 * 						명령행 매개변수의 갯수만큼 설정
		 * args[0] = "100"
		 * args[1] = "200"
		 
		System.out.println("첫 번째 명령행매개변수->"+args[0]);
		System.out.println("두 번째 명령행매개변수->"+args[1]);
		System.out.println("셋 번째 명령행매개변수->"+args[2]);
		System.out.println("넷 번째 명령행매개변수->"+args[3]);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		//String으로 입력받은 명령행매개변수를 int로 변환
		int num1 = Integer.parseInt(args[0]);//int = String X
		int num2 = Integer.parseInt(args[1]);//int = String X
		int num3 = Integer.parseInt(args[2]);//int = String X
		int num4 = Integer.parseInt(args[3]);//int = String X

		System.out.println("합=>"+(num1+num2+num3+num4));
	
	}*/
}
