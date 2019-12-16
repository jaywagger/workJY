package workbook;
//워크북 15페이지 8번 문제
public class WorkbookP15Q08 {
	/*int [] arr1 = new int [] {10,20,30,40,50};
	String [] aaa = new String[] {"a","b","c"};
	int [] arr = new int [5];
	배열은 heap에 자리를 생성한다. 그러기 위해서 new를 사용한다. */
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			
			sum = sum+ arr[i];
			
		}System.out.println("sum = "+sum);
		System.out.println("avg = "+sum/arr.length);
		
	}
	
}
