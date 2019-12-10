package workbook;

public class CalcTest05 {
	public static void main(String[] args) {
		//String으로 입력받은 명령행매개변수를 int로 변환
		int a = Integer.parseInt(args[0]);//int = String X
		int b = Integer.parseInt(args[1]);//int = String X
		int c = Integer.parseInt(args[2]);//int = String X
		int d = Integer.parseInt(args[3]);//int = String X
		
		Calc student = new Calc(); //Calc 메서드 활용
		int sum = student.calcSum(a, b, c, d);
		double ave = student.calcAve(sum);
		
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+ave);
		
		if(ave>100 & ave < 0)
		{
			System.out.println("잘못 입력하셨습니다");
		}
		else 
		{
			if (ave >= 90)
			{
				System.out.println("A학점");
			}
			else if (ave >= 70)
			{
				System.out.println("B학점");
			}
			else if (ave >= 50)
			{
				System.out.println("C학점");
			}
			else if (ave >= 30)
			{
				System.out.println("D학점");
			}
			else
			{
				System.out.println("F학점");
		}
		
		}
		
		
		
/*		System.out.println("첫 번째 명령행매개변수->"+args[0]);
		System.out.println("두 번째 명령행매개변수->"+args[1]);
		System.out.println("셋 번째 명령행매개변수->"+args[2]);
		System.out.println("넷 번째 명령행매개변수->"+args[3]);
	
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}*/


	
	}
}
