package workbook;
//워크북 3페이지 2번 문제
//Ascii값 확인하기
public class WorkbookP3Q02 {
	public static void main(String[] args) {
		String s1  = "1";
		String s2  = "2";
		boolean bnx = false;
		char c1 = 'A'; //65
		char c2 = 'B'; //66
		char c3 = '1'; //49
		char c4 = '2'; //50
		
		int inx = 2;
		
		System.out.println(s1+s2); //12
		System.out.println(!bnx); //true
		System.out.println(c1+c2); //131
		System.out.println(c1+c4-c2+inx); //51
		System.out.println(c3+c4); //99
		System.out.println("------------------------------");
		System.out.println("1"+"2"); //12
		System.out.println(!bnx); //true
		System.out.println('A'+'B'); //131
		System.out.println('1'+2); //51
		System.out.println('1'+'2'); //99
		System.out.println("-------------------------------");
	}

}
