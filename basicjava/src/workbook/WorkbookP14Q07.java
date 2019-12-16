package workbook;
//워크북 14페이지 7번문제
public class WorkbookP14Q07 {

	public static void main(String[] args) {
		System.out.println("Enter any integer");
/*	int x = Integer.parseInt(args[0]);
		//System.out.println("입력값 곱하기 10: "+(x*10));
		int sum = 0;
		int total = x;
		System.out.print(x);
		for(int i=1; i<101; i++) {
			sum = x+(x*i);
			if(sum>1 && sum <= 100) {
			System.out.print(" + "+sum);
			total = total+sum;} 
		} System.out.print(" = "+(total));*/
		      int num = Integer.parseInt(args[0]);
		      System.out.print(num);
		      int i = 2;
		      int sum= 0;
		      while(true) {
		         if(num*i>100)break;
		         sum+=num*i;
		         
		         i++;
		         System.out.print("+"+num*i);
		      }
		      System.out.println("="+sum);
		}
		
}


