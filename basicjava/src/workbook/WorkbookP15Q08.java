package workbook;
//��ũ�� 15������ 8�� ����
public class WorkbookP15Q08 {
	/*int [] arr1 = new int [] {10,20,30,40,50};
	String [] aaa = new String[] {"a","b","c"};
	int [] arr = new int [5];
	�迭�� heap�� �ڸ��� �����Ѵ�. �׷��� ���ؼ� new�� ����Ѵ�. */
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			
			sum = sum+ arr[i];
			
		}System.out.println("sum = "+sum);
		System.out.println("avg = "+sum/arr.length);
		
	}
	
}
