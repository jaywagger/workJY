package workbook;
// 워크북 5페이지 4번 문제
// 문자형 변수 ch가 영문자 (대문자 또는 소문자)일 때만 변수 b의 값이 true가 되도록
// 프로그램을 완성 하시오.
public class WorkbookP5Q04 {
	public static void main(String[] args) {
		char ch = 'z';
		if (ch =='z' || ch=='Z')
		{boolean b = true;
		System.out.println(b);}
		System.out.println("=============================");
		boolean b = ('a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z');
		System.out.println(b);
	}

}
